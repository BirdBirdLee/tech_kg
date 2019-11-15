package cn.tcualhp.tech_kg.neo4jRepo;

import cn.tcualhp.tech_kg.model.Neo4jNode.PaperNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author lihepeng
 * @description 论文查询neo4j的Repo
 * @date 2019-11-02 21:44
 **/
public interface PaperNodeRepo extends Neo4jRepository<PaperNode, Long> {
    /**
     * 根据论文 name 论文名 获取论文信息
     *
     * @param name 论文名
     * @return 返回论文节点 PaperNode 的 list
     */
    List<PaperNode> getPaperNodeByNameContains(@Param("name") String name);

    /**
     * 根据论文 paperId 来获取论文信息
     *
     * @param paperId 论文 paperId
     * @return 返回论文节点 PaperNode 的 list
     */
    List<PaperNode> getPaperNodeByPaperId(@Param("paperId") String paperId);

    /**
     * 根据论文关键词获取论文信息
     *
     * @param keywords 论文关键词
     * @return 返回论文节点 PaperNode 的 list
     */
    List<PaperNode> getPaperNodeByKeywordsContains(@Param("keywords") String keywords);

    /**
     * 根据论文发表 year 年份获取论文信息
     *
     * @param year 论文发表年
     * @return 返回论文节点 PaperNode 的 list
     */
    List<PaperNode> getPaperNodeByYear(@Param("year") int year);

    /**
     * 通过论文发表的 area_code 获取论文信息
     *
     * @param areaCode 论文发表分区号
     * @return 返回论文节点 PaperNode 的 list
     */
    List<PaperNode> getPaperNodeByAreaCode(@Param("areaCode") int areaCode);

}
