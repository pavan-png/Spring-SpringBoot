package in.orcas.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.orcas.bean.MyBean;
import in.orcas.config.AppConfig;

public class TestApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

        MyBean bean = context.getBean(MyBean.class);
        bean.doWork();

        context.close(); // triggers @PreDestroy
    }
}
