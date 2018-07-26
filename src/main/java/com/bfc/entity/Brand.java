package com.bfc.entity;

import com.redxun.core.entity.BaseTenantEntity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;
import com.redxun.core.annotion.table.FieldDefine;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * <pre>
 *  
 * 描述：品牌资源登记实体类定义
 * 作者：tom_y
 * 邮箱: 377811501@qq.com
 * 日期:2017-09-03 21:36:52
 * 版权：海雅集团
 * </pre>
 */
public class Brand extends BaseTenantEntity {
	
	@FieldDefine(title = "主键")
	@Id
	@Column(name = "ID_")
	protected String id;

	@FieldDefine(title = "外键")
	@Column(name = "REF_ID_")
	protected String refId;
	@FieldDefine(title = "品牌等级")
	@Column(name = "GRADE")
	protected String GRADE;
	@FieldDefine(title = "品牌等级")
	@Column(name = "GRADE_NAME")
	protected String gradeName;
	@FieldDefine(title = "品牌业态")
	@Column(name = "PPYT")
	protected String PPYT;
	@FieldDefine(title = "品牌业态")
	@Column(name = "PPYT_NAME")
	protected String ppytName;
	@FieldDefine(title = "持有类型")
	@Column(name = "HOLDTYPE")
	protected String HOLDTYPE;
	@FieldDefine(title = "持有类型")
	@Column(name = "HOLDTYPE_NAME")
	protected String holdtypeName;
	@FieldDefine(title = "品牌名称（中文）")
	@Column(name = "NAME_CH")
	protected String nameCh;
	@FieldDefine(title = "品牌名称（英文）")
	@Column(name = "NAME_EN")
	protected String nameEn;
	@FieldDefine(title = "商标注册证编码")
	@Column(name = "TRADEMARK_CODE")
	protected String trademarkCode;
	@FieldDefine(title = "品牌市场经营年限")
	@Column(name = "YEARS")
	protected Double YEARS;
	@FieldDefine(title = "品牌注册地")
	@Column(name = "REGADDRESS")
	protected String REGADDRESS;
	@FieldDefine(title = "品牌介绍")
	@Column(name = "INTRODUCTION")
	protected String INTRODUCTION;
	@FieldDefine(title = "品牌市场地位分析（优势、劣势）")
	@Column(name = "POSITION")
	protected String POSITION;
	@FieldDefine(title = "竞争品牌(不低于四个)")
	@Column(name = "COMPETING")
	protected String COMPETING;
	@FieldDefine(title = "商标注册证")
	@Column(name = "TRADEMARK_UP")
	protected String trademarkUp;
	@FieldDefine(title = "品牌授权许可证")
	@Column(name = "LICENSE_UP")
	protected String licenseUp;
	@FieldDefine(title = "品牌风格")
	@Column(name = "STYE")
	protected String STYE;
	@FieldDefine(title = "年龄层")
	@Column(name = "AGE")
	protected String AGE;
	@FieldDefine(title = "年龄层")
	@Column(name = "AGE_NAME")
	protected String ageName;
	@FieldDefine(title = "收入")
	@Column(name = "INCOME")
	protected String INCOME;
	@FieldDefine(title = "收入")
	@Column(name = "INCOME_NAME")
	protected String incomeName;
	@FieldDefine(title = "客单价")
	@Column(name = "PRICE")
	protected String PRICE;
	@FieldDefine(title = "上货波段")
	@Column(name = "LOADING")
	protected String LOADING;
	@FieldDefine(title = "春季产品")
	@Column(name = "SPRODUCT")
	protected String SPRODUCT;
	@FieldDefine(title = "夏季产品")
	@Column(name = "SUMPRODUCT")
	protected String SUMPRODUCT;
	@FieldDefine(title = "秋季产品")
	@Column(name = "APRODUCT")
	protected String APRODUCT;
	@FieldDefine(title = "冬季产品")
	@Column(name = "WPRODUCT")
	protected String WPRODUCT;
	@FieldDefine(title = "春季产品")
	@Column(name = "BSPRODUCT")
	protected String BSPRODUCT;
	@FieldDefine(title = "夏季产品")
	@Column(name = "BSUMPRODUCT")
	protected String BSUMPRODUCT;
	@FieldDefine(title = "秋季产品")
	@Column(name = "BAPRODUCT")
	protected String BAPRODUCT;
	@FieldDefine(title = "冬季产品")
	@Column(name = "BWPRODUCT")
	protected String BWPRODUCT;
	@FieldDefine(title = "全国门店数总计（必填）")
	@Column(name = "TOTALNUM")
	protected Double TOTALNUM;
	@FieldDefine(title = "全国销售业绩总计（必填）")
	@Column(name = "TOTALSALES")
	protected Double TOTALSALES;
	@FieldDefine(title = "经营面积（实用）")
	@Column(name = "AREA")
	protected String AREA;
	@FieldDefine(title = "专柜位置")
	@Column(name = "POSITIONSS")
	protected String POSITIONSS;
	@FieldDefine(title = "专柜位置")
	@Column(name = "POSITIONSS_NAME")
	protected String positionssName;
	@FieldDefine(title = "彼邻品牌需求")
	@Column(name = "NEIGHBOR")
	protected String NEIGHBOR;
	@FieldDefine(title = "合作门店")
	@Column(name = "COOSTORES")
	protected String COOSTORES;
	@FieldDefine(title = "合作门店")
	@Column(name = "COOSTORES_NAME")
	protected String coostoresName;
	@FieldDefine(title = "合作年限")
	@Column(name = "COOYEARS")
	protected String COOYEARS;
	@FieldDefine(title = "层高要求")
	@Column(name = "STOREY")
	protected Double STOREY;
	@FieldDefine(title = "供电")
	@Column(name = "ELECTRICITY")
	protected Double ELECTRICITY;
	@FieldDefine(title = "燃气")
	@Column(name = "GAS")
	protected Double GAS;
	@FieldDefine(title = "供水管径")
	@Column(name = "WATERIN")
	protected String WATERIN;
	@FieldDefine(title = "新风管径")
	@Column(name = "AIRIN")
	protected String AIRIN;
	@FieldDefine(title = "空调")
	@Column(name = "AIRCONDITION")
	protected String AIRCONDITION;
	@FieldDefine(title = "空调")
	@Column(name = "AIRCONDITION_NAME")
	protected String airconditionName;
	@FieldDefine(title = "空调")
	@Column(name = "CENTRALAIR")
	protected Double CENTRALAIR;
	@FieldDefine(title = "排水管径")
	@Column(name = "WATEROUT")
	protected String WATEROUT;
	@FieldDefine(title = "排风管径")
	@Column(name = "AIROUT")
	protected String AIROUT;
	@FieldDefine(title = "隔油池")
	@Column(name = "OIL")
	protected String OIL;
	@FieldDefine(title = "隔油池")
	@Column(name = "OIL_NAME")
	protected String oilName;
	@FieldDefine(title = "隔油池")
	@Column(name = "OILSELF")
	protected Double OILSELF;
	@FieldDefine(title = "排污管径")
	@Column(name = "SEWAGE")
	protected String SEWAGE;
	@FieldDefine(title = "排烟管径")
	@Column(name = "SMOKEOUT")
	protected String SMOKEOUT;
	@FieldDefine(title = "其它")
	@Column(name = "OTHER")
	protected String OTHER;
	@FieldDefine(title = "是否入库")
	@Column(name = "STATUS")
	protected String STATUS;
	@FieldDefine(title = "是否入库")
	@Column(name = "STATUS_NAME")
	protected String statusName;
	@FieldDefine(title = "流程实例ID")
	@Column(name = "INST_ID_")
	protected String instId;
	@FieldDefine(title = "状态")
	@Column(name = "INST_STATUS_")
	protected String instStatus;
	@FieldDefine(title = "用户ID")
	@Column(name = "CREATE_USER_ID_")
	protected String createUserId;
	@FieldDefine(title = "组ID")
	@Column(name = "CREATE_GROUP_ID_")
	protected String createGroupId;
	@FieldDefine(title = "公司名称")
	@Column(name = "SUPPLIER")
	protected String SUPPLIER;
	@FieldDefine(title = "公司名称")
	@Column(name = "SUPPLIER_NAME")
	protected String supplierName;
	@FieldDefine(title = "品牌业态2")
	@Column(name = "PPYT2")
	protected String PPYT2;
	@FieldDefine(title = "品牌业态2")
	@Column(name = "PPYT2_NAME")
	protected String ppyt2Name;
	@FieldDefine(title = "品牌业态3")
	@Column(name = "PPYT3")
	protected String PPYT3;
	@FieldDefine(title = "品牌业态3")
	@Column(name = "PPYT3_NAME")
	protected String ppyt3Name;
	@FieldDefine(title = "品牌优势区域")
	@Column(name = "BESTAREA")
	protected String BESTAREA;
	@FieldDefine(title = "品牌优势区域")
	@Column(name = "BESTAREA_NAME")
	protected String bestareaName;
	@FieldDefine(title = "公司id")
	@Column(name = "COMPANYID")
	protected String COMPANYID;
	@FieldDefine(title = "投递品牌类型")
	@Column(name = "TDPPLX")
	protected String TDPPLX;
	@FieldDefine(title = "投递品牌类型")
	@Column(name = "TDPPLXID")
	protected String TDPPLXID;
	
	
	
	public Brand() {
	}

	/**
	 * Default Key Fields Constructor for class Orders
	 */
	 
	 
	public Brand(String in_id) {
		this.setPkId(in_id);
	}
	@Override
	public String getIdentifyLabel() {
		return this.id;
	}

	@Override
	public Serializable getPkId() {
		return this.id;
	}

	@Override
	public void setPkId(Serializable pkId) {
		this.id = (String) pkId;
	}
	
	public String getId() {
		return this.id;
	}

	
	public void setId(String aValue) {
		this.id = aValue;
	}
	
	public void setRefId(String refId) {
		this.refId = refId;
	}
	
	/**
	 * 返回 外键
	 * @return
	 */
	public String getRefId() {
		return this.refId;
	}
	public void setGRADE(String GRADE) {
		this.GRADE = GRADE;
	}
	
	/**
	 * 返回 品牌等级
	 * @return
	 */
	public String getGRADE() {
		return this.GRADE;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	
	/**
	 * 返回 品牌等级
	 * @return
	 */
	public String getGradeName() {
		return this.gradeName;
	}
	public void setPPYT(String PPYT) {
		this.PPYT = PPYT;
	}
	
	/**
	 * 返回 品牌业态
	 * @return
	 */
	public String getPPYT() {
		return this.PPYT;
	}
	public void setPpytName(String ppytName) {
		this.ppytName = ppytName;
	}
	
	/**
	 * 返回 品牌业态
	 * @return
	 */
	public String getPpytName() {
		return this.ppytName;
	}
	public void setHOLDTYPE(String HOLDTYPE) {
		this.HOLDTYPE = HOLDTYPE;
	}
	
	/**
	 * 返回 持有类型
	 * @return
	 */
	public String getHOLDTYPE() {
		return this.HOLDTYPE;
	}
	public void setHoldtypeName(String holdtypeName) {
		this.holdtypeName = holdtypeName;
	}
	
	/**
	 * 返回 持有类型
	 * @return
	 */
	public String getHoldtypeName() {
		return this.holdtypeName;
	}
	public void setNameCh(String nameCh) {
		this.nameCh = nameCh;
	}
	
	/**
	 * 返回 品牌名称（中文）
	 * @return
	 */
	public String getNameCh() {
		return this.nameCh;
	}
	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}
	
	/**
	 * 返回 品牌名称（英文）
	 * @return
	 */
	public String getNameEn() {
		return this.nameEn;
	}
	public void setTrademarkCode(String trademarkCode) {
		this.trademarkCode = trademarkCode;
	}
	
	/**
	 * 返回 商标注册证编码
	 * @return
	 */
	public String getTrademarkCode() {
		return this.trademarkCode;
	}
	public void setYEARS(Double YEARS) {
		this.YEARS = YEARS;
	}
	
	/**
	 * 返回 品牌市场经营年限
	 * @return
	 */
	public Double getYEARS() {
		return this.YEARS;
	}
	public void setREGADDRESS(String REGADDRESS) {
		this.REGADDRESS = REGADDRESS;
	}
	
	/**
	 * 返回 品牌注册地
	 * @return
	 */
	public String getREGADDRESS() {
		return this.REGADDRESS;
	}
	public void setINTRODUCTION(String INTRODUCTION) {
		this.INTRODUCTION = INTRODUCTION;
	}
	
	/**
	 * 返回 品牌介绍
	 * @return
	 */
	public String getINTRODUCTION() {
		return this.INTRODUCTION;
	}
	public void setPOSITION(String POSITION) {
		this.POSITION = POSITION;
	}
	
	/**
	 * 返回 品牌市场地位分析（优势、劣势）
	 * @return
	 */
	public String getPOSITION() {
		return this.POSITION;
	}
	public void setCOMPETING(String COMPETING) {
		this.COMPETING = COMPETING;
	}
	
	/**
	 * 返回 竞争品牌(不低于四个)
	 * @return
	 */
	public String getCOMPETING() {
		return this.COMPETING;
	}
	public void setTrademarkUp(String trademarkUp) {
		this.trademarkUp = trademarkUp;
	}
	
	/**
	 * 返回 商标注册证
	 * @return
	 */
	public String getTrademarkUp() {
		return this.trademarkUp;
	}
	public void setLicenseUp(String licenseUp) {
		this.licenseUp = licenseUp;
	}
	
	/**
	 * 返回 品牌授权许可证
	 * @return
	 */
	public String getLicenseUp() {
		return this.licenseUp;
	}
	public void setSTYE(String STYE) {
		this.STYE = STYE;
	}
	
	/**
	 * 返回 品牌风格
	 * @return
	 */
	public String getSTYE() {
		return this.STYE;
	}
	public void setAGE(String AGE) {
		this.AGE = AGE;
	}
	
	/**
	 * 返回 年龄层
	 * @return
	 */
	public String getAGE() {
		return this.AGE;
	}
	public void setAgeName(String ageName) {
		this.ageName = ageName;
	}
	
	/**
	 * 返回 年龄层
	 * @return
	 */
	public String getAgeName() {
		return this.ageName;
	}
	public void setINCOME(String INCOME) {
		this.INCOME = INCOME;
	}
	
	/**
	 * 返回 收入
	 * @return
	 */
	public String getINCOME() {
		return this.INCOME;
	}
	public void setIncomeName(String incomeName) {
		this.incomeName = incomeName;
	}
	
	/**
	 * 返回 收入
	 * @return
	 */
	public String getIncomeName() {
		return this.incomeName;
	}
	public void setPRICE(String PRICE) {
		this.PRICE = PRICE;
	}
	
	/**
	 * 返回 客单价
	 * @return
	 */
	public String getPRICE() {
		return this.PRICE;
	}
	public void setLOADING(String LOADING) {
		this.LOADING = LOADING;
	}
	
	/**
	 * 返回 上货波段
	 * @return
	 */
	public String getLOADING() {
		return this.LOADING;
	}
	public void setSPRODUCT(String SPRODUCT) {
		this.SPRODUCT = SPRODUCT;
	}
	
	/**
	 * 返回 春季产品
	 * @return
	 */
	public String getSPRODUCT() {
		return this.SPRODUCT;
	}
	public void setSUMPRODUCT(String SUMPRODUCT) {
		this.SUMPRODUCT = SUMPRODUCT;
	}
	
	/**
	 * 返回 夏季产品
	 * @return
	 */
	public String getSUMPRODUCT() {
		return this.SUMPRODUCT;
	}
	public void setAPRODUCT(String APRODUCT) {
		this.APRODUCT = APRODUCT;
	}
	
	/**
	 * 返回 秋季产品
	 * @return
	 */
	public String getAPRODUCT() {
		return this.APRODUCT;
	}
	public void setWPRODUCT(String WPRODUCT) {
		this.WPRODUCT = WPRODUCT;
	}
	
	/**
	 * 返回 冬季产品
	 * @return
	 */
	public String getWPRODUCT() {
		return this.WPRODUCT;
	}
	public void setBSPRODUCT(String BSPRODUCT) {
		this.BSPRODUCT = BSPRODUCT;
	}
	
	/**
	 * 返回 春季产品
	 * @return
	 */
	public String getBSPRODUCT() {
		return this.BSPRODUCT;
	}
	public void setBSUMPRODUCT(String BSUMPRODUCT) {
		this.BSUMPRODUCT = BSUMPRODUCT;
	}
	
	/**
	 * 返回 夏季产品
	 * @return
	 */
	public String getBSUMPRODUCT() {
		return this.BSUMPRODUCT;
	}
	public void setBAPRODUCT(String BAPRODUCT) {
		this.BAPRODUCT = BAPRODUCT;
	}
	
	/**
	 * 返回 秋季产品
	 * @return
	 */
	public String getBAPRODUCT() {
		return this.BAPRODUCT;
	}
	public void setBWPRODUCT(String BWPRODUCT) {
		this.BWPRODUCT = BWPRODUCT;
	}
	
	/**
	 * 返回 冬季产品
	 * @return
	 */
	public String getBWPRODUCT() {
		return this.BWPRODUCT;
	}
	public void setTOTALNUM(Double TOTALNUM) {
		this.TOTALNUM = TOTALNUM;
	}
	
	/**
	 * 返回 全国门店数总计（必填）
	 * @return
	 */
	public Double getTOTALNUM() {
		return this.TOTALNUM;
	}
	public void setTOTALSALES(Double TOTALSALES) {
		this.TOTALSALES = TOTALSALES;
	}
	
	/**
	 * 返回 全国销售业绩总计（必填）
	 * @return
	 */
	public Double getTOTALSALES() {
		return this.TOTALSALES;
	}
	public void setAREA(String AREA) {
		this.AREA = AREA;
	}
	
	/**
	 * 返回 经营面积（实用）
	 * @return
	 */
	public String getAREA() {
		return this.AREA;
	}
	public void setPOSITIONSS(String POSITIONSS) {
		this.POSITIONSS = POSITIONSS;
	}
	
	/**
	 * 返回 专柜位置
	 * @return
	 */
	public String getPOSITIONSS() {
		return this.POSITIONSS;
	}
	public void setPositionssName(String positionssName) {
		this.positionssName = positionssName;
	}
	
	/**
	 * 返回 专柜位置
	 * @return
	 */
	public String getPositionssName() {
		return this.positionssName;
	}
	public void setNEIGHBOR(String NEIGHBOR) {
		this.NEIGHBOR = NEIGHBOR;
	}
	
	/**
	 * 返回 彼邻品牌需求
	 * @return
	 */
	public String getNEIGHBOR() {
		return this.NEIGHBOR;
	}
	public void setCOOSTORES(String COOSTORES) {
		this.COOSTORES = COOSTORES;
	}
	
	/**
	 * 返回 合作门店
	 * @return
	 */
	public String getCOOSTORES() {
		return this.COOSTORES;
	}
	public void setCoostoresName(String coostoresName) {
		this.coostoresName = coostoresName;
	}
	
	/**
	 * 返回 合作门店
	 * @return
	 */
	public String getCoostoresName() {
		return this.coostoresName;
	}
	public void setCOOYEARS(String COOYEARS) {
		this.COOYEARS = COOYEARS;
	}
	
	/**
	 * 返回 合作年限
	 * @return
	 */
	public String getCOOYEARS() {
		return this.COOYEARS;
	}
	public void setSTOREY(Double STOREY) {
		this.STOREY = STOREY;
	}
	
	/**
	 * 返回 层高要求
	 * @return
	 */
	public Double getSTOREY() {
		return this.STOREY;
	}
	public void setELECTRICITY(Double ELECTRICITY) {
		this.ELECTRICITY = ELECTRICITY;
	}
	
	/**
	 * 返回 供电
	 * @return
	 */
	public Double getELECTRICITY() {
		return this.ELECTRICITY;
	}
	public void setGAS(Double GAS) {
		this.GAS = GAS;
	}
	
	/**
	 * 返回 燃气
	 * @return
	 */
	public Double getGAS() {
		return this.GAS;
	}
	public void setWATERIN(String WATERIN) {
		this.WATERIN = WATERIN;
	}
	
	/**
	 * 返回 供水管径
	 * @return
	 */
	public String getWATERIN() {
		return this.WATERIN;
	}
	public void setAIRIN(String AIRIN) {
		this.AIRIN = AIRIN;
	}
	
	/**
	 * 返回 新风管径
	 * @return
	 */
	public String getAIRIN() {
		return this.AIRIN;
	}
	public void setAIRCONDITION(String AIRCONDITION) {
		this.AIRCONDITION = AIRCONDITION;
	}
	
	/**
	 * 返回 空调
	 * @return
	 */
	public String getAIRCONDITION() {
		return this.AIRCONDITION;
	}
	public void setAirconditionName(String airconditionName) {
		this.airconditionName = airconditionName;
	}
	
	/**
	 * 返回 空调
	 * @return
	 */
	public String getAirconditionName() {
		return this.airconditionName;
	}
	public void setCENTRALAIR(Double CENTRALAIR) {
		this.CENTRALAIR = CENTRALAIR;
	}
	
	/**
	 * 返回 空调
	 * @return
	 */
	public Double getCENTRALAIR() {
		return this.CENTRALAIR;
	}
	public void setWATEROUT(String WATEROUT) {
		this.WATEROUT = WATEROUT;
	}
	
	/**
	 * 返回 排水管径
	 * @return
	 */
	public String getWATEROUT() {
		return this.WATEROUT;
	}
	public void setAIROUT(String AIROUT) {
		this.AIROUT = AIROUT;
	}
	
	/**
	 * 返回 排风管径
	 * @return
	 */
	public String getAIROUT() {
		return this.AIROUT;
	}
	public void setOIL(String OIL) {
		this.OIL = OIL;
	}
	
	/**
	 * 返回 隔油池
	 * @return
	 */
	public String getOIL() {
		return this.OIL;
	}
	public void setOilName(String oilName) {
		this.oilName = oilName;
	}
	
	/**
	 * 返回 隔油池
	 * @return
	 */
	public String getOilName() {
		return this.oilName;
	}
	public void setOILSELF(Double OILSELF) {
		this.OILSELF = OILSELF;
	}
	
	/**
	 * 返回 隔油池
	 * @return
	 */
	public Double getOILSELF() {
		return this.OILSELF;
	}
	public void setSEWAGE(String SEWAGE) {
		this.SEWAGE = SEWAGE;
	}
	
	/**
	 * 返回 排污管径
	 * @return
	 */
	public String getSEWAGE() {
		return this.SEWAGE;
	}
	public void setSMOKEOUT(String SMOKEOUT) {
		this.SMOKEOUT = SMOKEOUT;
	}
	
	/**
	 * 返回 排烟管径
	 * @return
	 */
	public String getSMOKEOUT() {
		return this.SMOKEOUT;
	}
	public void setOTHER(String OTHER) {
		this.OTHER = OTHER;
	}
	
	/**
	 * 返回 其它
	 * @return
	 */
	public String getOTHER() {
		return this.OTHER;
	}
	public void setSTATUS(String STATUS) {
		this.STATUS = STATUS;
	}
	
	/**
	 * 返回 是否入库
	 * @return
	 */
	public String getSTATUS() {
		return this.STATUS;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	
	/**
	 * 返回 是否入库
	 * @return
	 */
	public String getStatusName() {
		return this.statusName;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}
	
	/**
	 * 返回 流程实例ID
	 * @return
	 */
	public String getInstId() {
		return this.instId;
	}
	public void setInstStatus(String instStatus) {
		this.instStatus = instStatus;
	}
	
	/**
	 * 返回 状态
	 * @return
	 */
	public String getInstStatus() {
		return this.instStatus;
	}
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}
	
	/**
	 * 返回 用户ID
	 * @return
	 */
	public String getCreateUserId() {
		return this.createUserId;
	}
	public void setCreateGroupId(String createGroupId) {
		this.createGroupId = createGroupId;
	}
	
	/**
	 * 返回 组ID
	 * @return
	 */
	public String getCreateGroupId() {
		return this.createGroupId;
	}
	public void setSUPPLIER(String SUPPLIER) {
		this.SUPPLIER = SUPPLIER;
	}
	
	/**
	 * 返回 公司名称
	 * @return
	 */
	public String getSUPPLIER() {
		return this.SUPPLIER;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
	/**
	 * 返回 公司名称
	 * @return
	 */
	public String getSupplierName() {
		return this.supplierName;
	}
	public void setPPYT2(String PPYT2) {
		this.PPYT2 = PPYT2;
	}
	
	/**
	 * 返回 品牌业态2
	 * @return
	 */
	public String getPPYT2() {
		return this.PPYT2;
	}
	public void setPpyt2Name(String ppyt2Name) {
		this.ppyt2Name = ppyt2Name;
	}
	
	/**
	 * 返回 品牌业态2
	 * @return
	 */
	public String getPpyt2Name() {
		return this.ppyt2Name;
	}
	public void setPPYT3(String PPYT3) {
		this.PPYT3 = PPYT3;
	}
	
	/**
	 * 返回 品牌业态3
	 * @return
	 */
	public String getPPYT3() {
		return this.PPYT3;
	}
	public void setPpyt3Name(String ppyt3Name) {
		this.ppyt3Name = ppyt3Name;
	}
	
	/**
	 * 返回 品牌业态3
	 * @return
	 */
	public String getPpyt3Name() {
		return this.ppyt3Name;
	}
	public void setBESTAREA(String BESTAREA) {
		this.BESTAREA = BESTAREA;
	}
	
	/**
	 * 返回 品牌优势区域
	 * @return
	 */
	public String getBESTAREA() {
		return this.BESTAREA;
	}
	public void setBestareaName(String bestareaName) {
		this.bestareaName = bestareaName;
	}
	
	/**
	 * 返回 品牌优势区域
	 * @return
	 */
	public String getBestareaName() {
		return this.bestareaName;
	}
	public void setCOMPANYID(String COMPANYID) {
		this.COMPANYID = COMPANYID;
	}
	
	/**
	 * 返回 公司id
	 * @return
	 */
	public String getCOMPANYID() {
		return this.COMPANYID;
	}
	public void setTDPPLX(String TDPPLX) {
		this.TDPPLX = TDPPLX;
	}
	
	/**
	 * 返回 投递品牌类型
	 * @return
	 */
	public String getTDPPLX() {
		return this.TDPPLX;
	}
	public void setTDPPLXID(String TDPPLXID) {
		this.TDPPLXID = TDPPLXID;
	}
	
	/**
	 * 返回 投递品牌类型
	 * @return
	 */
	public String getTDPPLXID() {
		return this.TDPPLXID;
	}
	
		

	/**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object) {
		if (!(object instanceof Brand)) {
			return false;
		}
		Brand rhs = (Brand) object;
		return new EqualsBuilder()
		.append(this.id, rhs.id) 
		.append(this.refId, rhs.refId) 
		.append(this.GRADE, rhs.GRADE) 
		.append(this.gradeName, rhs.gradeName) 
		.append(this.PPYT, rhs.PPYT) 
		.append(this.ppytName, rhs.ppytName) 
		.append(this.HOLDTYPE, rhs.HOLDTYPE) 
		.append(this.holdtypeName, rhs.holdtypeName) 
		.append(this.nameCh, rhs.nameCh) 
		.append(this.nameEn, rhs.nameEn) 
		.append(this.trademarkCode, rhs.trademarkCode) 
		.append(this.YEARS, rhs.YEARS) 
		.append(this.REGADDRESS, rhs.REGADDRESS) 
		.append(this.INTRODUCTION, rhs.INTRODUCTION) 
		.append(this.POSITION, rhs.POSITION) 
		.append(this.COMPETING, rhs.COMPETING) 
		.append(this.trademarkUp, rhs.trademarkUp) 
		.append(this.licenseUp, rhs.licenseUp) 
		.append(this.STYE, rhs.STYE) 
		.append(this.AGE, rhs.AGE) 
		.append(this.ageName, rhs.ageName) 
		.append(this.INCOME, rhs.INCOME) 
		.append(this.incomeName, rhs.incomeName) 
		.append(this.PRICE, rhs.PRICE) 
		.append(this.LOADING, rhs.LOADING) 
		.append(this.SPRODUCT, rhs.SPRODUCT) 
		.append(this.SUMPRODUCT, rhs.SUMPRODUCT) 
		.append(this.APRODUCT, rhs.APRODUCT) 
		.append(this.WPRODUCT, rhs.WPRODUCT) 
		.append(this.BSPRODUCT, rhs.BSPRODUCT) 
		.append(this.BSUMPRODUCT, rhs.BSUMPRODUCT) 
		.append(this.BAPRODUCT, rhs.BAPRODUCT) 
		.append(this.BWPRODUCT, rhs.BWPRODUCT) 
		.append(this.TOTALNUM, rhs.TOTALNUM) 
		.append(this.TOTALSALES, rhs.TOTALSALES) 
		.append(this.AREA, rhs.AREA) 
		.append(this.POSITIONSS, rhs.POSITIONSS) 
		.append(this.positionssName, rhs.positionssName) 
		.append(this.NEIGHBOR, rhs.NEIGHBOR) 
		.append(this.COOSTORES, rhs.COOSTORES) 
		.append(this.coostoresName, rhs.coostoresName) 
		.append(this.COOYEARS, rhs.COOYEARS) 
		.append(this.STOREY, rhs.STOREY) 
		.append(this.ELECTRICITY, rhs.ELECTRICITY) 
		.append(this.GAS, rhs.GAS) 
		.append(this.WATERIN, rhs.WATERIN) 
		.append(this.AIRIN, rhs.AIRIN) 
		.append(this.AIRCONDITION, rhs.AIRCONDITION) 
		.append(this.airconditionName, rhs.airconditionName) 
		.append(this.CENTRALAIR, rhs.CENTRALAIR) 
		.append(this.WATEROUT, rhs.WATEROUT) 
		.append(this.AIROUT, rhs.AIROUT) 
		.append(this.OIL, rhs.OIL) 
		.append(this.oilName, rhs.oilName) 
		.append(this.OILSELF, rhs.OILSELF) 
		.append(this.SEWAGE, rhs.SEWAGE) 
		.append(this.SMOKEOUT, rhs.SMOKEOUT) 
		.append(this.OTHER, rhs.OTHER) 
		.append(this.STATUS, rhs.STATUS) 
		.append(this.statusName, rhs.statusName) 
		.append(this.instId, rhs.instId) 
		.append(this.instStatus, rhs.instStatus) 
		.append(this.createUserId, rhs.createUserId) 
		.append(this.createGroupId, rhs.createGroupId) 
		.append(this.SUPPLIER, rhs.SUPPLIER) 
		.append(this.supplierName, rhs.supplierName) 
		.append(this.PPYT2, rhs.PPYT2) 
		.append(this.ppyt2Name, rhs.ppyt2Name) 
		.append(this.PPYT3, rhs.PPYT3) 
		.append(this.ppyt3Name, rhs.ppyt3Name) 
		.append(this.BESTAREA, rhs.BESTAREA) 
		.append(this.bestareaName, rhs.bestareaName) 
		.append(this.COMPANYID, rhs.COMPANYID) 
		.append(this.TDPPLX, rhs.TDPPLX) 
		.append(this.TDPPLXID, rhs.TDPPLXID) 
		.isEquals();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return new HashCodeBuilder(-82280557, -700257973)
		.append(this.id) 
		.append(this.refId) 
		.append(this.GRADE) 
		.append(this.gradeName) 
		.append(this.PPYT) 
		.append(this.ppytName) 
		.append(this.HOLDTYPE) 
		.append(this.holdtypeName) 
		.append(this.nameCh) 
		.append(this.nameEn) 
		.append(this.trademarkCode) 
		.append(this.YEARS) 
		.append(this.REGADDRESS) 
		.append(this.INTRODUCTION) 
		.append(this.POSITION) 
		.append(this.COMPETING) 
		.append(this.trademarkUp) 
		.append(this.licenseUp) 
		.append(this.STYE) 
		.append(this.AGE) 
		.append(this.ageName) 
		.append(this.INCOME) 
		.append(this.incomeName) 
		.append(this.PRICE) 
		.append(this.LOADING) 
		.append(this.SPRODUCT) 
		.append(this.SUMPRODUCT) 
		.append(this.APRODUCT) 
		.append(this.WPRODUCT) 
		.append(this.BSPRODUCT) 
		.append(this.BSUMPRODUCT) 
		.append(this.BAPRODUCT) 
		.append(this.BWPRODUCT) 
		.append(this.TOTALNUM) 
		.append(this.TOTALSALES) 
		.append(this.AREA) 
		.append(this.POSITIONSS) 
		.append(this.positionssName) 
		.append(this.NEIGHBOR) 
		.append(this.COOSTORES) 
		.append(this.coostoresName) 
		.append(this.COOYEARS) 
		.append(this.STOREY) 
		.append(this.ELECTRICITY) 
		.append(this.GAS) 
		.append(this.WATERIN) 
		.append(this.AIRIN) 
		.append(this.AIRCONDITION) 
		.append(this.airconditionName) 
		.append(this.CENTRALAIR) 
		.append(this.WATEROUT) 
		.append(this.AIROUT) 
		.append(this.OIL) 
		.append(this.oilName) 
		.append(this.OILSELF) 
		.append(this.SEWAGE) 
		.append(this.SMOKEOUT) 
		.append(this.OTHER) 
		.append(this.STATUS) 
		.append(this.statusName) 
		.append(this.instId) 
		.append(this.instStatus) 
		.append(this.createUserId) 
		.append(this.createGroupId) 
		.append(this.SUPPLIER) 
		.append(this.supplierName) 
		.append(this.PPYT2) 
		.append(this.ppyt2Name) 
		.append(this.PPYT3) 
		.append(this.ppyt3Name) 
		.append(this.BESTAREA) 
		.append(this.bestareaName) 
		.append(this.COMPANYID) 
		.append(this.TDPPLX) 
		.append(this.TDPPLXID) 
		.toHashCode();
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this)
		.append("id", this.id) 
				.append("refId", this.refId) 
				.append("GRADE", this.GRADE) 
				.append("gradeName", this.gradeName) 
				.append("PPYT", this.PPYT) 
				.append("ppytName", this.ppytName) 
				.append("HOLDTYPE", this.HOLDTYPE) 
				.append("holdtypeName", this.holdtypeName) 
				.append("nameCh", this.nameCh) 
				.append("nameEn", this.nameEn) 
				.append("trademarkCode", this.trademarkCode) 
				.append("YEARS", this.YEARS) 
				.append("REGADDRESS", this.REGADDRESS) 
				.append("INTRODUCTION", this.INTRODUCTION) 
				.append("POSITION", this.POSITION) 
				.append("COMPETING", this.COMPETING) 
				.append("trademarkUp", this.trademarkUp) 
				.append("licenseUp", this.licenseUp) 
				.append("STYE", this.STYE) 
				.append("AGE", this.AGE) 
				.append("ageName", this.ageName) 
				.append("INCOME", this.INCOME) 
				.append("incomeName", this.incomeName) 
				.append("PRICE", this.PRICE) 
				.append("LOADING", this.LOADING) 
				.append("SPRODUCT", this.SPRODUCT) 
				.append("SUMPRODUCT", this.SUMPRODUCT) 
				.append("APRODUCT", this.APRODUCT) 
				.append("WPRODUCT", this.WPRODUCT) 
				.append("BSPRODUCT", this.BSPRODUCT) 
				.append("BSUMPRODUCT", this.BSUMPRODUCT) 
				.append("BAPRODUCT", this.BAPRODUCT) 
				.append("BWPRODUCT", this.BWPRODUCT) 
				.append("TOTALNUM", this.TOTALNUM) 
				.append("TOTALSALES", this.TOTALSALES) 
				.append("AREA", this.AREA) 
				.append("POSITIONSS", this.POSITIONSS) 
				.append("positionssName", this.positionssName) 
				.append("NEIGHBOR", this.NEIGHBOR) 
				.append("COOSTORES", this.COOSTORES) 
				.append("coostoresName", this.coostoresName) 
				.append("COOYEARS", this.COOYEARS) 
				.append("STOREY", this.STOREY) 
				.append("ELECTRICITY", this.ELECTRICITY) 
				.append("GAS", this.GAS) 
				.append("WATERIN", this.WATERIN) 
				.append("AIRIN", this.AIRIN) 
				.append("AIRCONDITION", this.AIRCONDITION) 
				.append("airconditionName", this.airconditionName) 
				.append("CENTRALAIR", this.CENTRALAIR) 
				.append("WATEROUT", this.WATEROUT) 
				.append("AIROUT", this.AIROUT) 
				.append("OIL", this.OIL) 
				.append("oilName", this.oilName) 
				.append("OILSELF", this.OILSELF) 
				.append("SEWAGE", this.SEWAGE) 
				.append("SMOKEOUT", this.SMOKEOUT) 
				.append("OTHER", this.OTHER) 
				.append("STATUS", this.STATUS) 
				.append("statusName", this.statusName) 
				.append("instId", this.instId) 
				.append("instStatus", this.instStatus) 
				.append("createUserId", this.createUserId) 
				.append("createGroupId", this.createGroupId) 
										.append("SUPPLIER", this.SUPPLIER) 
				.append("supplierName", this.supplierName) 
				.append("PPYT2", this.PPYT2) 
				.append("ppyt2Name", this.ppyt2Name) 
				.append("PPYT3", this.PPYT3) 
				.append("ppyt3Name", this.ppyt3Name) 
				.append("BESTAREA", this.BESTAREA) 
				.append("bestareaName", this.bestareaName) 
				.append("COMPANYID", this.COMPANYID) 
				.append("TDPPLX", this.TDPPLX) 
				.append("TDPPLXID", this.TDPPLXID) 
		.toString();
	}

}



