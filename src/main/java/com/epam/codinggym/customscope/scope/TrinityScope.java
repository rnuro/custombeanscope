package com.epam.codinggym.customscope.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TrinityScope implements Scope {
    private final Map<String, List<Object>> scopeStorage = new ConcurrentHashMap<>();

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        List<Object> beans;
        if (!scopeStorage.containsKey(name)) {
            beans = new ArrayList<>();
            scopeStorage.put(name, beans);
        } else {
            beans = scopeStorage.get(name);
        }
        if (beans.size() < 3) {
            Object bean = objectFactory.getObject();
            beans.add(bean);
            return bean;
        }
        Collections.shuffle(beans);
        return beans.get(0);
    }

    @Override
    public Object remove(String name) {
        return scopeStorage.remove(name);
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
