package ru.antonyukav.no_thanks;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import ru.antonyukav.no_thanks.ui.GameUI;

@SpringBootApplication
public class NoThanksApplication {

	public static void main(String[] args) {
		ApplicationContext context = new SpringApplicationBuilder(NoThanksApplication.class).headless(false).run(args);
		GameUI gameUI = (GameUI) context.getBean("gameUI");
		gameUI.start();

	}

}
