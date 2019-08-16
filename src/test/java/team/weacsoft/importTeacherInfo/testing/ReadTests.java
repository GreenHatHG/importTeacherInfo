package team.weacsoft.importTeacherInfo.testing;

import org.junit.jupiter.api.Test;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class ReadTests extends Junit5Factory{

    @Test
    public void IdTest() throws Exception {
        this.mockMvc.perform(get("/teacherinfos/100"))
                .andExpect(status().isOk())
                .andDo(document("findById"));
    }

	@Test
	public void jobNumberTest() throws Exception {
		this.mockMvc.perform(get("/teacherinfos/jobnumber/1"))
				.andExpect(status().isOk())
				.andDo(document("findByJobNumber"));
	}

	@Test
	public void NameTest() throws Exception {
		this.mockMvc.perform(get("/teacherinfos/name/2"))
				.andExpect(status().isOk())
				.andDo(document("findByName"));
	}

	@Test
	public void OfficeTest() throws Exception {
		this.mockMvc.perform(get("/teacherinfos/office/3"))
				.andExpect(status().isOk())
				.andDo(document("findByOffice"));
	}

	@Test
	public void PhoneTest() throws Exception {
		this.mockMvc.perform(get("/teacherinfos/phone/4"))
				.andExpect(status().isOk())
				.andDo(document("findByPhone"));
	}

	@Test
	public void FtpNumberTest() throws Exception {
		this.mockMvc.perform(get("/teacherinfos/ftpnumber/100"))
				.andExpect(status().isOk())
				.andDo(document("findByFtpNumber"));
	}

	@Test
	public void FtpPasswordTest() throws Exception {
		this.mockMvc.perform(get("/teacherinfos/ftppassword/9"))
				.andExpect(status().isOk())
				.andDo(document("findByFtpPassword"));
	}

}