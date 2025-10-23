package org.embed;

import static org.assertj.core.api.Assertions.assertThat;

import org.embed.configuration.MyTestConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

//@SpringBootTest(useMainMethod = UseMainMethod.ALWAYS)
@SpringBootTest(args = "--app.test=one")
@Import(MyTestConfiguration.class)
class SpringMyApplicationTests {

	@Test
	void contextLoads() {
	}
	
	
	@Test
	void applicationArgumentPopulated(@Autowired ApplicationArguments args) {
		asserThat(args.getOptionNames()).containsOnly("app.test")
		assertThat(args.getOptionValue("app.test").containsOnly)("one");
		
		
	}

}
