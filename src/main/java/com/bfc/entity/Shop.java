
package com.bfc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.redxun.core.annotion.table.FieldDefine;
import com.redxun.core.entity.BaseTenantEntity;

/**
 * <pre>
 *  
 * 描述：铺位招商实体类定义
 * 作者：Tom_y
 * 邮箱: 377811501@qq.com
 * 日期:2018-04-09 15:45:25
 * 版权：海雅商业
 * </pre>
 */
public class Shop extends BaseTenantEntity {
	
	@FieldDefine(title = "主键")
	@Id
	@Column(name = "ID_")
	protected String id;

	@FieldDefine(title = "外键")
	@Column(name = "REF_ID_")
	protected String refId;
	@FieldDefine(title = "主题")
	@Column(name = "SUBJECT")
	protected String SUBJECT;
	@FieldDefine(title = "品牌业态")
	@Column(name = "PPYT")
	protected String PPYT;
	@FieldDefine(title = "品牌业态")
	@Column(name = "PPYT_NAME")
	protected String ppytName;
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
	@FieldDefine(title = "开标时间")
	@Column(name = "STARTDATE")
	protected Date STARTDATE;
	@FieldDefine(title = "截标时间")
	@Column(name = "ENDDATE")
	protected Date ENDDATE;
	@FieldDefine(title = "招商门店")
	@Column(name = "STORE")
	protected String STORE;
	@FieldDefine(title = "招商门店")
	@Column(name = "STORE_NAME")
	protected String storeName;
	@FieldDefine(title = "楼层")
	@Column(name = "FLOOR")
	protected String FLOOR;
	@FieldDefine(title = "招商铺位")
	@Column(name = "SHOP")
	protected String SHOP;
	@FieldDefine(title = "铺位面积")
	@Column(name = "AREA")
	protected String AREA;
	@FieldDefine(title = "品牌类型")
	@Column(name = "TYPE")
	protected String TYPE;
	@FieldDefine(title = "品牌类型")
	@Column(name = "TYPE_NAME")
	protected String typeName;
	@FieldDefine(title = "品牌等级")
	@Column(name = "GRADE")
	protected String GRADE;
	@FieldDefine(title = "品牌等级")
	@Column(name = "GRADE_NAME")
	protected String gradeName;
	@FieldDefine(title = "合作方式")
	@Column(name = "COOPERATE")
	protected String COOPERATE;
	@FieldDefine(title = "合作方式")
	@Column(name = "COOPERATE_NAME")
	protected String cooperateName;
	@FieldDefine(title = "租金范围")
	@Column(name = "RENTSTART")
	protected String RENTSTART;
	@FieldDefine(title = "租金范围")
	@Column(name = "RENTEND")
	protected String RENTEND;
	@FieldDefine(title = "区域图")
	@Column(name = "AREACHART")
	protected String AREACHART;
	@FieldDefine(title = "位置图")
	@Column(name = "LOCATIONMAP")
	protected String LOCATIONMAP;
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
	@FieldDefine(title = "招标方式")
	@Column(name = "ZBFS")
	protected String ZBFS;
	@FieldDefine(title = "邀请公司")
	@Column(name = "YQGS")
	protected String YQGS;
	@FieldDefine(title = "邀请公司")
	@Column(name = "YQGSID")
	protected String YQGSID;
	@FieldDefine(title = "邀请公司手机号")
	@Column(name = "SJH")
	protected String SJH;
	@FieldDefine(title = "邀请公司手机号")
	@Column(name = "YQGSLXDH")
	protected String YQGSLXDH;
	@FieldDefine(title = "租金扣点")
	@Column(name = "ZJQSKD")
	protected String ZJQSKD;
	@FieldDefine(title = "租赁起始年限")
	@Column(name = "ZLQSNX")
	protected Long ZLQSNX;
	@FieldDefine(title = "租赁终止年限")
	@Column(name = "ZLZZNX")
	protected String ZLZZNX;
	@FieldDefine(title = "租金扣点")
	@Column(name = "ZJZZKD")
	protected String ZJZZKD;
	@FieldDefine(title = "品牌等级ID")
	@Column(name = "GRADE1")
	protected String GRADE1;
	@FieldDefine(title = "品牌等级")
	@Column(name = "GRADE1_NAME")
	protected String grade1Name;
	@FieldDefine(title = "租金范围")
	@Column(name = "RENTSTART1")
	protected String RENTSTART1;
	@FieldDefine(title = "租金范围")
	@Column(name = "RENTEND1")
	protected String RENTEND1;
	@FieldDefine(title = "租金扣点")
	@Column(name = "ZJQSKD1")
	protected String ZJQSKD1;
	@FieldDefine(title = "租金扣点")
	@Column(name = "ZJZZKD1")
	protected String ZJZZKD1;
	@FieldDefine(title = "品牌等级ID")
	@Column(name = "GRADE2")
	protected String GRADE2;
	@FieldDefine(title = "品牌等级")
	@Column(name = "GRADE2_NAME")
	protected String grade2Name;
	@FieldDefine(title = "租金范围")
	@Column(name = "RENTSTART2")
	protected String RENTSTART2;
	@FieldDefine(title = "租金范围")
	@Column(name = "RENTEND2")
	protected String RENTEND2;
	@FieldDefine(title = "租金扣点")
	@Column(name = "ZJQSKD2")
	protected String ZJQSKD2;
	@FieldDefine(title = "租金扣点")
	@Column(name = "ZJZZKD2")
	protected String ZJZZKD2;
	@FieldDefine(title = "品牌等级ID")
	@Column(name = "GRADE3")
	protected String GRADE3;
	@FieldDefine(title = "品牌等级")
	@Column(name = "GRADE3_NAME")
	protected String grade3Name;
	@FieldDefine(title = "租金范围")
	@Column(name = "RENTSTART3")
	protected String RENTSTART3;
	@FieldDefine(title = "租金范围")
	@Column(name = "RENTEND3")
	protected String RENTEND3;
	@FieldDefine(title = "租金扣点")
	@Column(name = "ZJQSKD3")
	protected String ZJQSKD3;
	@FieldDefine(title = "租金扣点")
	@Column(name = "ZJZZKD3")
	protected String ZJZZKD3;
		protected java.util.List<Shop> shops = new java.util.ArrayList<Shop>();
	
	
	public java.util.List<Shop> getShops() {
			return shops;
		}

		public void setShops(java.util.List<Shop> shops) {
			this.shops = shops;
		}

	public Shop() {
	}

	/**
	 * Default Key Fields Constructor for class Orders
	 */
	 
	 
	public Shop(String in_id) {
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
	public void setSUBJECT(String SUBJECT) {
		this.SUBJECT = SUBJECT;
	}
	
	/**
	 * 返回 主题
	 * @return
	 */
	public String getSUBJECT() {
		return this.SUBJECT;
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
	public void setSTARTDATE(Date STARTDATE) {
		this.STARTDATE = STARTDATE;
	}
	
	/**
	 * 返回 开标时间
	 * @return
	 */
	public Date getSTARTDATE() {
		return this.STARTDATE;
	}
	public void setENDDATE(Date ENDDATE) {
		this.ENDDATE = ENDDATE;
	}
	
	/**
	 * 返回 截标时间
	 * @return
	 */
	public Date getENDDATE() {
		return this.ENDDATE;
	}
	public void setSTORE(String STORE) {
		this.STORE = STORE;
	}
	
	/**
	 * 返回 招商门店
	 * @return
	 */
	public String getSTORE() {
		return this.STORE;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	/**
	 * 返回 招商门店
	 * @return
	 */
	public String getStoreName() {
		return this.storeName;
	}
	public void setFLOOR(String FLOOR) {
		this.FLOOR = FLOOR;
	}
	
	/**
	 * 返回 楼层
	 * @return
	 */
	public String getFLOOR() {
		return this.FLOOR;
	}
	public void setSHOP(String SHOP) {
		this.SHOP = SHOP;
	}
	
	/**
	 * 返回 招商铺位
	 * @return
	 */
	public String getSHOP() {
		return this.SHOP;
	}
	public void setAREA(String AREA) {
		this.AREA = AREA;
	}
	
	/**
	 * 返回 铺位面积
	 * @return
	 */
	public String getAREA() {
		return this.AREA;
	}
	public void setTYPE(String TYPE) {
		this.TYPE = TYPE;
	}
	
	/**
	 * 返回 品牌类型
	 * @return
	 */
	public String getTYPE() {
		return this.TYPE;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	/**
	 * 返回 品牌类型
	 * @return
	 */
	public String getTypeName() {
		return this.typeName;
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
	public void setCOOPERATE(String COOPERATE) {
		this.COOPERATE = COOPERATE;
	}
	
	/**
	 * 返回 合作方式
	 * @return
	 */
	public String getCOOPERATE() {
		return this.COOPERATE;
	}
	public void setCooperateName(String cooperateName) {
		this.cooperateName = cooperateName;
	}
	
	/**
	 * 返回 合作方式
	 * @return
	 */
	public String getCooperateName() {
		return this.cooperateName;
	}
	public void setRENTSTART(String RENTSTART) {
		this.RENTSTART = RENTSTART;
	}
	
	/**
	 * 返回 租金范围
	 * @return
	 */
	public String getRENTSTART() {
		return this.RENTSTART;
	}
	public void setRENTEND(String RENTEND) {
		this.RENTEND = RENTEND;
	}
	
	/**
	 * 返回 租金范围
	 * @return
	 */
	public String getRENTEND() {
		return this.RENTEND;
	}
	public void setAREACHART(String AREACHART) {
		this.AREACHART = AREACHART;
	}
	
	/**
	 * 返回 区域图
	 * @return
	 */
	public String getAREACHART() {
		return this.AREACHART;
	}
	public void setLOCATIONMAP(String LOCATIONMAP) {
		this.LOCATIONMAP = LOCATIONMAP;
	}
	
	/**
	 * 返回 位置图
	 * @return
	 */
	public String getLOCATIONMAP() {
		return this.LOCATIONMAP;
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
	public void setZBFS(String ZBFS) {
		this.ZBFS = ZBFS;
	}
	
	/**
	 * 返回 招标方式
	 * @return
	 */
	public String getZBFS() {
		return this.ZBFS;
	}
	public void setYQGS(String YQGS) {
		this.YQGS = YQGS;
	}
	
	/**
	 * 返回 邀请公司
	 * @return
	 */
	public String getYQGS() {
		return this.YQGS;
	}
	public void setYQGSID(String YQGSID) {
		this.YQGSID = YQGSID;
	}
	
	/**
	 * 返回 邀请公司
	 * @return
	 */
	public String getYQGSID() {
		return this.YQGSID;
	}
	public void setSJH(String SJH) {
		this.SJH = SJH;
	}
	
	/**
	 * 返回 邀请公司手机号
	 * @return
	 */
	public String getSJH() {
		return this.SJH;
	}
	public void setYQGSLXDH(String YQGSLXDH) {
		this.YQGSLXDH = YQGSLXDH;
	}
	
	/**
	 * 返回 邀请公司手机号
	 * @return
	 */
	public String getYQGSLXDH() {
		return this.YQGSLXDH;
	}
	public void setZJQSKD(String ZJQSKD) {
		this.ZJQSKD = ZJQSKD;
	}
	
	/**
	 * 返回 租金扣点
	 * @return
	 */
	public String getZJQSKD() {
		return this.ZJQSKD;
	}
	public void setZLQSNX(Long ZLQSNX) {
		this.ZLQSNX = ZLQSNX;
	}
	
	/**
	 * 返回 租赁起始年限
	 * @return
	 */
	public Long getZLQSNX() {
		return this.ZLQSNX;
	}
	public void setZLZZNX(String ZLZZNX) {
		this.ZLZZNX = ZLZZNX;
	}
	
	/**
	 * 返回 租赁终止年限
	 * @return
	 */
	public String getZLZZNX() {
		return this.ZLZZNX;
	}
	public void setZJZZKD(String ZJZZKD) {
		this.ZJZZKD = ZJZZKD;
	}
	
	/**
	 * 返回 租金扣点
	 * @return
	 */
	public String getZJZZKD() {
		return this.ZJZZKD;
	}
	public void setGRADE1(String GRADE1) {
		this.GRADE1 = GRADE1;
	}
	
	/**
	 * 返回 品牌等级ID
	 * @return
	 */
	public String getGRADE1() {
		return this.GRADE1;
	}
	public void setGrade1Name(String grade1Name) {
		this.grade1Name = grade1Name;
	}
	
	/**
	 * 返回 品牌等级
	 * @return
	 */
	public String getGrade1Name() {
		return this.grade1Name;
	}
	public void setRENTSTART1(String RENTSTART1) {
		this.RENTSTART1 = RENTSTART1;
	}
	
	/**
	 * 返回 租金范围
	 * @return
	 */
	public String getRENTSTART1() {
		return this.RENTSTART1;
	}
	public void setRENTEND1(String RENTEND1) {
		this.RENTEND1 = RENTEND1;
	}
	
	/**
	 * 返回 租金范围
	 * @return
	 */
	public String getRENTEND1() {
		return this.RENTEND1;
	}
	public void setZJQSKD1(String ZJQSKD1) {
		this.ZJQSKD1 = ZJQSKD1;
	}
	
	/**
	 * 返回 租金扣点
	 * @return
	 */
	public String getZJQSKD1() {
		return this.ZJQSKD1;
	}
	public void setZJZZKD1(String ZJZZKD1) {
		this.ZJZZKD1 = ZJZZKD1;
	}
	
	/**
	 * 返回 租金扣点
	 * @return
	 */
	public String getZJZZKD1() {
		return this.ZJZZKD1;
	}
	public void setGRADE2(String GRADE2) {
		this.GRADE2 = GRADE2;
	}
	
	/**
	 * 返回 品牌等级ID
	 * @return
	 */
	public String getGRADE2() {
		return this.GRADE2;
	}
	public void setGrade2Name(String grade2Name) {
		this.grade2Name = grade2Name;
	}
	
	/**
	 * 返回 品牌等级
	 * @return
	 */
	public String getGrade2Name() {
		return this.grade2Name;
	}
	public void setRENTSTART2(String RENTSTART2) {
		this.RENTSTART2 = RENTSTART2;
	}
	
	/**
	 * 返回 租金范围
	 * @return
	 */
	public String getRENTSTART2() {
		return this.RENTSTART2;
	}
	public void setRENTEND2(String RENTEND2) {
		this.RENTEND2 = RENTEND2;
	}
	
	/**
	 * 返回 租金范围
	 * @return
	 */
	public String getRENTEND2() {
		return this.RENTEND2;
	}
	public void setZJQSKD2(String ZJQSKD2) {
		this.ZJQSKD2 = ZJQSKD2;
	}
	
	/**
	 * 返回 租金扣点
	 * @return
	 */
	public String getZJQSKD2() {
		return this.ZJQSKD2;
	}
	public void setZJZZKD2(String ZJZZKD2) {
		this.ZJZZKD2 = ZJZZKD2;
	}
	
	/**
	 * 返回 租金扣点
	 * @return
	 */
	public String getZJZZKD2() {
		return this.ZJZZKD2;
	}
	public void setGRADE3(String GRADE3) {
		this.GRADE3 = GRADE3;
	}
	
	/**
	 * 返回 品牌等级ID
	 * @return
	 */
	public String getGRADE3() {
		return this.GRADE3;
	}
	public void setGrade3Name(String grade3Name) {
		this.grade3Name = grade3Name;
	}
	
	/**
	 * 返回 品牌等级
	 * @return
	 */
	public String getGrade3Name() {
		return this.grade3Name;
	}
	public void setRENTSTART3(String RENTSTART3) {
		this.RENTSTART3 = RENTSTART3;
	}
	
	/**
	 * 返回 租金范围
	 * @return
	 */
	public String getRENTSTART3() {
		return this.RENTSTART3;
	}
	public void setRENTEND3(String RENTEND3) {
		this.RENTEND3 = RENTEND3;
	}
	
	/**
	 * 返回 租金范围
	 * @return
	 */
	public String getRENTEND3() {
		return this.RENTEND3;
	}
	public void setZJQSKD3(String ZJQSKD3) {
		this.ZJQSKD3 = ZJQSKD3;
	}
	
	/**
	 * 返回 租金扣点
	 * @return
	 */
	public String getZJQSKD3() {
		return this.ZJQSKD3;
	}
	public void setZJZZKD3(String ZJZZKD3) {
		this.ZJZZKD3 = ZJZZKD3;
	}
	
	/**
	 * 返回 租金扣点
	 * @return
	 */
	public String getZJZZKD3() {
		return this.ZJZZKD3;
	}
	
		

	/**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object) {
		if (!(object instanceof Shop)) {
			return false;
		}
		Shop rhs = (Shop) object;
		return new EqualsBuilder()
		.append(this.id, rhs.id) 
		.append(this.refId, rhs.refId) 
		.append(this.SUBJECT, rhs.SUBJECT) 
		.append(this.PPYT, rhs.PPYT) 
		.append(this.ppytName, rhs.ppytName) 
		.append(this.PPYT2, rhs.PPYT2) 
		.append(this.ppyt2Name, rhs.ppyt2Name) 
		.append(this.PPYT3, rhs.PPYT3) 
		.append(this.ppyt3Name, rhs.ppyt3Name) 
		.append(this.STARTDATE, rhs.STARTDATE) 
		.append(this.ENDDATE, rhs.ENDDATE) 
		.append(this.STORE, rhs.STORE) 
		.append(this.storeName, rhs.storeName) 
		.append(this.FLOOR, rhs.FLOOR) 
		.append(this.SHOP, rhs.SHOP) 
		.append(this.AREA, rhs.AREA) 
		.append(this.TYPE, rhs.TYPE) 
		.append(this.typeName, rhs.typeName) 
		.append(this.GRADE, rhs.GRADE) 
		.append(this.gradeName, rhs.gradeName) 
		.append(this.COOPERATE, rhs.COOPERATE) 
		.append(this.cooperateName, rhs.cooperateName) 
		.append(this.RENTSTART, rhs.RENTSTART) 
		.append(this.RENTEND, rhs.RENTEND) 
		.append(this.AREACHART, rhs.AREACHART) 
		.append(this.LOCATIONMAP, rhs.LOCATIONMAP) 
		.append(this.STOREY, rhs.STOREY) 
		.append(this.ELECTRICITY, rhs.ELECTRICITY) 
		.append(this.GAS, rhs.GAS) 
		.append(this.WATERIN, rhs.WATERIN) 
		.append(this.AIRIN, rhs.AIRIN) 
		.append(this.airconditionName, rhs.airconditionName) 
		.append(this.CENTRALAIR, rhs.CENTRALAIR) 
		.append(this.WATEROUT, rhs.WATEROUT) 
		.append(this.AIROUT, rhs.AIROUT) 
		.append(this.oilName, rhs.oilName) 
		.append(this.OILSELF, rhs.OILSELF) 
		.append(this.SEWAGE, rhs.SEWAGE) 
		.append(this.SMOKEOUT, rhs.SMOKEOUT) 
		.append(this.OTHER, rhs.OTHER) 
		.append(this.instId, rhs.instId) 
		.append(this.instStatus, rhs.instStatus) 
		.append(this.createUserId, rhs.createUserId) 
		.append(this.createGroupId, rhs.createGroupId) 
		.append(this.ZBFS, rhs.ZBFS) 
		.append(this.YQGS, rhs.YQGS) 
		.append(this.YQGSID, rhs.YQGSID) 
		.append(this.SJH, rhs.SJH) 
		.append(this.YQGSLXDH, rhs.YQGSLXDH) 
		.append(this.ZJQSKD, rhs.ZJQSKD) 
		.append(this.ZLQSNX, rhs.ZLQSNX) 
		.append(this.ZLZZNX, rhs.ZLZZNX) 
		.append(this.ZJZZKD, rhs.ZJZZKD) 
		.append(this.GRADE1, rhs.GRADE1) 
		.append(this.grade1Name, rhs.grade1Name) 
		.append(this.RENTSTART1, rhs.RENTSTART1) 
		.append(this.RENTEND1, rhs.RENTEND1) 
		.append(this.ZJQSKD1, rhs.ZJQSKD1) 
		.append(this.ZJZZKD1, rhs.ZJZZKD1) 
		.append(this.GRADE2, rhs.GRADE2) 
		.append(this.grade2Name, rhs.grade2Name) 
		.append(this.RENTSTART2, rhs.RENTSTART2) 
		.append(this.RENTEND2, rhs.RENTEND2) 
		.append(this.ZJQSKD2, rhs.ZJQSKD2) 
		.append(this.ZJZZKD2, rhs.ZJZZKD2) 
		.append(this.GRADE3, rhs.GRADE3) 
		.append(this.grade3Name, rhs.grade3Name) 
		.append(this.RENTSTART3, rhs.RENTSTART3) 
		.append(this.RENTEND3, rhs.RENTEND3) 
		.append(this.ZJQSKD3, rhs.ZJQSKD3) 
		.append(this.ZJZZKD3, rhs.ZJZZKD3) 
		.isEquals();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return new HashCodeBuilder(-82280557, -700257973)
		.append(this.id) 
		.append(this.refId) 
		.append(this.SUBJECT) 
		.append(this.PPYT) 
		.append(this.ppytName) 
		.append(this.PPYT2) 
		.append(this.ppyt2Name) 
		.append(this.PPYT3) 
		.append(this.ppyt3Name) 
		.append(this.STARTDATE) 
		.append(this.ENDDATE) 
		.append(this.STORE) 
		.append(this.storeName) 
		.append(this.FLOOR) 
		.append(this.SHOP) 
		.append(this.AREA) 
		.append(this.TYPE) 
		.append(this.typeName) 
		.append(this.GRADE) 
		.append(this.gradeName) 
		.append(this.COOPERATE) 
		.append(this.cooperateName) 
		.append(this.RENTSTART) 
		.append(this.RENTEND) 
		.append(this.AREACHART) 
		.append(this.LOCATIONMAP) 
		.append(this.STOREY) 
		.append(this.ELECTRICITY) 
		.append(this.GAS) 
		.append(this.WATERIN) 
		.append(this.AIRIN) 
		.append(this.airconditionName) 
		.append(this.CENTRALAIR) 
		.append(this.WATEROUT) 
		.append(this.AIROUT) 
		.append(this.oilName) 
		.append(this.OILSELF) 
		.append(this.SEWAGE) 
		.append(this.SMOKEOUT) 
		.append(this.OTHER) 
		.append(this.instId) 
		.append(this.instStatus) 
		.append(this.createUserId) 
		.append(this.createGroupId) 
		.append(this.ZBFS) 
		.append(this.YQGS) 
		.append(this.YQGSID) 
		.append(this.SJH) 
		.append(this.YQGSLXDH) 
		.append(this.ZJQSKD) 
		.append(this.ZLQSNX) 
		.append(this.ZLZZNX) 
		.append(this.ZJZZKD) 
		.append(this.GRADE1) 
		.append(this.grade1Name) 
		.append(this.RENTSTART1) 
		.append(this.RENTEND1) 
		.append(this.ZJQSKD1) 
		.append(this.ZJZZKD1) 
		.append(this.GRADE2) 
		.append(this.grade2Name) 
		.append(this.RENTSTART2) 
		.append(this.RENTEND2) 
		.append(this.ZJQSKD2) 
		.append(this.ZJZZKD2) 
		.append(this.GRADE3) 
		.append(this.grade3Name) 
		.append(this.RENTSTART3) 
		.append(this.RENTEND3) 
		.append(this.ZJQSKD3) 
		.append(this.ZJZZKD3) 
		.toHashCode();
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this)
		.append("id", this.id) 
				.append("refId", this.refId) 
				.append("SUBJECT", this.SUBJECT) 
				.append("PPYT", this.PPYT) 
				.append("ppytName", this.ppytName) 
				.append("PPYT2", this.PPYT2) 
				.append("ppyt2Name", this.ppyt2Name) 
				.append("PPYT3", this.PPYT3) 
				.append("ppyt3Name", this.ppyt3Name) 
				.append("STARTDATE", this.STARTDATE) 
				.append("ENDDATE", this.ENDDATE) 
				.append("STORE", this.STORE) 
				.append("storeName", this.storeName) 
				.append("FLOOR", this.FLOOR) 
				.append("SHOP", this.SHOP) 
				.append("AREA", this.AREA) 
				.append("TYPE", this.TYPE) 
				.append("typeName", this.typeName) 
				.append("GRADE", this.GRADE) 
				.append("gradeName", this.gradeName) 
				.append("COOPERATE", this.COOPERATE) 
				.append("cooperateName", this.cooperateName) 
				.append("RENTSTART", this.RENTSTART) 
				.append("RENTEND", this.RENTEND) 
				.append("AREACHART", this.AREACHART) 
				.append("LOCATIONMAP", this.LOCATIONMAP) 
				.append("STOREY", this.STOREY) 
				.append("ELECTRICITY", this.ELECTRICITY) 
				.append("GAS", this.GAS) 
				.append("WATERIN", this.WATERIN) 
				.append("AIRIN", this.AIRIN) 
				.append("airconditionName", this.airconditionName) 
				.append("CENTRALAIR", this.CENTRALAIR) 
				.append("WATEROUT", this.WATEROUT) 
				.append("AIROUT", this.AIROUT) 
				.append("oilName", this.oilName) 
				.append("OILSELF", this.OILSELF) 
				.append("SEWAGE", this.SEWAGE) 
				.append("SMOKEOUT", this.SMOKEOUT) 
				.append("OTHER", this.OTHER) 
				.append("instId", this.instId) 
				.append("instStatus", this.instStatus) 
				.append("createUserId", this.createUserId) 
				.append("createGroupId", this.createGroupId) 
										.append("ZBFS", this.ZBFS) 
				.append("YQGS", this.YQGS) 
				.append("YQGSID", this.YQGSID) 
				.append("SJH", this.SJH) 
				.append("YQGSLXDH", this.YQGSLXDH) 
				.append("ZJQSKD", this.ZJQSKD) 
				.append("ZLQSNX", this.ZLQSNX) 
				.append("ZLZZNX", this.ZLZZNX) 
				.append("ZJZZKD", this.ZJZZKD) 
				.append("GRADE1", this.GRADE1) 
				.append("grade1Name", this.grade1Name) 
				.append("RENTSTART1", this.RENTSTART1) 
				.append("RENTEND1", this.RENTEND1) 
				.append("ZJQSKD1", this.ZJQSKD1) 
				.append("ZJZZKD1", this.ZJZZKD1) 
				.append("GRADE2", this.GRADE2) 
				.append("grade2Name", this.grade2Name) 
				.append("RENTSTART2", this.RENTSTART2) 
				.append("RENTEND2", this.RENTEND2) 
				.append("ZJQSKD2", this.ZJQSKD2) 
				.append("ZJZZKD2", this.ZJZZKD2) 
				.append("GRADE3", this.GRADE3) 
				.append("grade3Name", this.grade3Name) 
				.append("RENTSTART3", this.RENTSTART3) 
				.append("RENTEND3", this.RENTEND3) 
				.append("ZJQSKD3", this.ZJQSKD3) 
				.append("ZJZZKD3", this.ZJZZKD3) 
		.toString();
	}

}



