package com.zdd.risk.dao;

import com.zdd.risk.bean.ApplyAmount;
import com.zdd.risk.bean.ApplyAmountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IApplyAmountDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_applyAmount
     *
     * @mbg.generated Tue Nov 06 15:01:52 CST 2018
     */
    long countByExample(ApplyAmountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_applyAmount
     *
     * @mbg.generated Tue Nov 06 15:01:52 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_applyAmount
     *
     * @mbg.generated Tue Nov 06 15:01:52 CST 2018
     */
    int insert(ApplyAmount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_applyAmount
     *
     * @mbg.generated Tue Nov 06 15:01:52 CST 2018
     */
    int insertSelective(ApplyAmount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_applyAmount
     *
     * @mbg.generated Tue Nov 06 15:01:52 CST 2018
     */
    List<ApplyAmount> selectByExample(ApplyAmountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_applyAmount
     *
     * @mbg.generated Tue Nov 06 15:01:52 CST 2018
     */
    ApplyAmount selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_applyAmount
     *
     * @mbg.generated Tue Nov 06 15:01:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") ApplyAmount record, @Param("example") ApplyAmountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_applyAmount
     *
     * @mbg.generated Tue Nov 06 15:01:52 CST 2018
     */
    int updateByExample(@Param("record") ApplyAmount record, @Param("example") ApplyAmountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_applyAmount
     *
     * @mbg.generated Tue Nov 06 15:01:52 CST 2018
     */
    int updateByPrimaryKeySelective(ApplyAmount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_applyAmount
     *
     * @mbg.generated Tue Nov 06 15:01:52 CST 2018
     */
    int updateByPrimaryKey(ApplyAmount record);
}