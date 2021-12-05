package com.ichint.crm.platform.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 导入任务表
 * </p>
 *
 * @author zhaojiatao
 * @since 2021-11-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ImportTask implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 任务类型
     */
    private Integer taskType;

    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 任务开始时间
     */
    private LocalDateTime startTime;

    /**
     * 任务结束时间
     */
    private LocalDateTime finishTime;

    /**
     * 任务状态枚举值
     */
    private Integer taskStatus;

    /**
     * 任务状态描述
     */
    private String taskStatusName;

    /**
     * 文件地址
     */
    private String fileUrl;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 允许导入条数
     */
    private Integer allowedCount;

    /**
     * 不允许导入条数
     */
    private Integer notAllowedCount;

    /**
     * 错误明细文件url
     */
    private String errorDetailFileUrl;

    /**
     * 错误明细文件名称
     */
    private String errorDetailFileName;

    /**
     * 导入成功条数
     */
    private Integer successCount;

    /**
     * 拓展字段
     */
    private String extraJson;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建人id
     */
    private Integer creatorId;

    /**
     * 创建人名称
     */
    private String creatorName;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 更新人id
     */
    private Integer updatorId;

    /**
     * 修改人姓名
     */
    private String updatorName;

    /**
     * 是否删除
     */
    private Integer isDeleted;


}
