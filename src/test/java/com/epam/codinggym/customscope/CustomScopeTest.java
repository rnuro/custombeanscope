package com.epam.codinggym.customscope;

import com.epam.codinggym.customscope.bean.CustomScopeBean;
import com.epam.codinggym.customscope.config.CustomScopeBeanConfig;
import com.epam.codinggym.customscope.config.TrinityScopeConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomScopeTest {
    @Test
    public void ScopeTest() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(CustomScopeBeanConfig.class);
        ctx.register(TrinityScopeConfig.class);
        ctx.refresh();

        CustomScopeBean bean1 = ctx.getBean(CustomScopeBean.class);
        CustomScopeBean bean2 = ctx.getBean(CustomScopeBean.class);
        CustomScopeBean bean3 = ctx.getBean(CustomScopeBean.class);
        CustomScopeBean bean4 = ctx.getBean(CustomScopeBean.class);
        CustomScopeBean bean5 = ctx.getBean(CustomScopeBean.class);

        bean1.speak();
        bean2.speak();
        bean3.speak();
        bean4.speak();
        bean5.speak();
    }
}
