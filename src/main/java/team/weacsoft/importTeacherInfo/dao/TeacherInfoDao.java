package team.weacsoft.importTeacherInfo.dao;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.data.jpa.repository.JpaRepository;
import team.weacsoft.importTeacherInfo.bean.TeacherInfo;

import java.util.List;

/**
 * @description:
 * @author: GreenHatHG
 * @create: 2019-08-09 15:11
 **/

/**
 * 一些基本办法由JpaRepository接口提供
 * 所以不需要手动定义
 */
public interface TeacherInfoDao extends JpaRepository<TeacherInfo, Long> {

    @ApiOperation(value = "得到符合条件的比赛信息",
            notes="得到的比赛信息有oj,比赛名称,开始时间,结束时间,时长,星期,链接")
    @ApiResponses({
            @ApiResponse(code = 200, message = "获取成功"),
            @ApiResponse(code = 400, message = "获取失败")
    })
    List<TeacherInfo> findAll();

}
