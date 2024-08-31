package lk.CodePro;


import lk.CodePro.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        Transaction transaction = (Transaction) ctx.getBean("transaction");
        transaction.startTransaction();
        transaction.endTransaction();
        ctx.registerShutdownHook();

    }
}
