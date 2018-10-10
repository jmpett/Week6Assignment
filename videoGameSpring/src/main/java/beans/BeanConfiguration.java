package beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean
	public VideoGameDao videoGameDao() {
		VideoGameMap bean = new VideoGameMap();
		return bean;
	}
	
	@Bean
	public VideoGameServicing videoGameServicing() {
		VideoGameImpl bean = new VideoGameImpl(videoGameDao());
		return bean;
	}
}
