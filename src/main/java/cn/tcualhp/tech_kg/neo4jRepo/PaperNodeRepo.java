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
     * 根据论文名称获取论文信息
     * @param name  论文信息
     * @return List<PaperNode>
     */
    List<PaperNode> getPapersByNameContains(@Param("name") String name);

    /**
     * 描述
     * @param paperId
     * @return
     */
    List<PaperNode> getPaperNodeByPaperId(@Param("paperId") String paperId);

    /**
     * 根据论文关键词获取论文信息
     * @param keywords
     * @return
     */
    List<PaperNode> getPaperNodeByKeywordsContains(@Param("keywords") String keywords)

}
