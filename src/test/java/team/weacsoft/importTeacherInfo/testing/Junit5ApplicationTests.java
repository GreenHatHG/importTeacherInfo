package team.weacsoft.importTeacherInfo.testing;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

public class Junit5ApplicationTests extends Junit5Test{

	@Test
	public void sampleTest() throws Exception {
		this.mockMvc.perform(get("/teacherinfos"))
				.andExpect(status().isOk())
				.andDo(document("findAll"));
	}

}