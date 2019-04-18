package com.iapi.drools.utils;

/**
 * 所有的ES索引
 *
 * @author 程国军
 * @date 2018/12/12
 */
public interface ElasticSearchIndexes {

    /**
     * 人员基本信息
     */
    String DCAP_F_PER_BASIC_INFO = "dcap_f_per_basic_info";
    /**
     * 中国公民出入境证件签发信息
     */
    String DCAP_F_PER_CERT_CHN_ISSUE = "dcap_f_per_cert_chn_issue";
    /**
     * 外国人签证签发信息
     */
    String DCAP_F_PER_CERT_FGN_VISA = "dcap_f_per_cert_fgn_visa";
    /**
     * 中国公民出国境证件签注信息
     */
    String DCAP_F_PER_CERT_CHN_VISA = "dcap_f_per_cert_chn_visa";
    /**
     * 港澳台居民往来大陆通行证证件签发信息
     */
    String DCAP_F_PER_CERT_HMT_ISSUE = "dcap_f_per_cert_hmt_issue";
    /**
     * 出入境人员信息
     */
    String DCAP_F_PER_ACT_PSR_IMM = "dcap_f_per_act_psr_imm";
    /**
     * API旅客预报信息
     */
    String DCAP_F_PER_PRED_API_PSR_INFO = "dcap_f_per_pred_api_psr_info";
    /**
     * 违法违规旅客信息
     */
    String DCAP_F_EVT_PSR_ILLEGAL = "dcap_f_evt_psr_illegal";
    /**
     * 重点人员关注信息
     */
    String DCAP_F_PER_REC_EMPH_PERSONS = "dcap_f_per_rec_emph_persons";
    /**
     * 境外人员常住信息
     */
    String DCAP_F_PER_FGN_RESIDENT_REG = "dcap_f_per_fgn_resident_reg";
    /**
     * 境外人员临时住宿登记信息
     */
    String DCAP_F_PER_FGN_TEMP_REG = "dcap_f_per_fgn_temp_reg";
    /**
     * 违法违规事件处理意见
     */
    String DCAP_F_EVT_OPINION = "dcap_f_evt_opinion";
    /**
     * 遣返遣送旅客信息
     */
    String DCAP_F_EVT_PSR_REPAT = "dcap_f_evt_psr_repat";
    /**
     * 机场代码表
     */
    String DCAP_F_COM_COD_AIRPORT_INFO = "dcap_f_com_cod_airport_info";
    /**
     * 口岸（检查站）信息
     */
    String DCAP_F_SVC_PORT_INFO = "dcap_f_svc_port_info";
    /**
     * 收缴证件信息
     */
    String DCAP_F_EVT_CAPT_CERT = "dcap_f_evt_capt_cert";
    /**
     * 收缴物品信息
     */
    String DCAP_F_EVT_CAPT_RES = "dcap_f_evt_capt_res";
    /**
     * 物品代码字典表
     */
    String DCAP_F_COM_COD_CAPT_RES_TYPE = "dcap_f_com_cod_capt_res_type";
    /**
     * 出入境人员携带枪支弹药登记信息
     */
    String DCAP_F_EVT_GUN_ACT_PSR_IMM = "dcap_f_evt_gun_act_psr_imm";
    /**
     * 新疆人名拼写代码表
     */
    String DCAP_F_COM_COD_SPELL = "dcap_f_com_cod_spell";
    /**
     * 自助通关备案信息
     */
    String DCAP_F_PER_REC_SELF_CLEARANCE = "dcap_f_per_rec_self_clearance";
    /**
     * 行政区划代码
     */
    String DCAP_F_COM_COD_REGION = "dcap_f_com_cod_region";
    /**
     * 涉外籍维族人信息
     */
    String DCAP_F_TERR_REC_FGN_UYGUR = "dcap_f_terr_rec_fgn_uygur";
    /**
     * 涉外案事件人员信息
     */
    String DCAP_F_EVT_FGN_CAS_PERSON = "dcap_f_evt_fgn_cas_person";
    /**
     * 机场口岸对照表
     */
    String IAPI_DM_AIRPORT_MATCH = "iapi_dm_airport_match";
    /**
     * 机场表
     */
    String IAPI_DM_AIRPORT = "iapi_dm_airport";
    /**
     * 航空公司信息
     */
    String IAPI_DM_AIRCOMPANY = "iapi_dm_aircompany";
    /**
     * 国籍代码
     */
    String IAPI_DM_NATIONALITY = "iapi_dm_nationality";
    /**
     * 旅客申报信息
     */
    String TB_IAPI = "tb_iapi";
    /**
     * 支付信息
     */
    String TB_PNR_FOP = "tb_pnr_fop";
    /**
     * 旅客常客信息
     */
    String TB_PNR_FTI = "tb_pnr_fti";
    /**
     * 旅客证件和票号信息
     */
    String TB_PNR_TRAVELER_TKT = "tb_pnr_traveler_tkt";
    /**
     * 航班行程信息
     */
    String TB_PNR_TVL = "tb_pnr_tvl";
    /**
     * 机票信息
     */
    String TB_PNR_TKT = "tb_pnr_tkt";
    /**
     * 涉外案事件信息
     */
    String DCAP_F_EVT_FGN_CASE = "dcap_f_evt_fgn_case";
    /**
     * 涉案人员类别代码
     */
    String DCAP_F_COM_COD_CAS_PERS_TYPE = "dcap_f_com_cod_cas_pers_type";
    /**
     * 案事件类别代码
     */
    String DCAP_F_COM_COD_FGN_CAS_TYPE = "dcap_f_com_cod_fgn_cas_type";

    /**
     * 重点字典项	管理
     */
    String TB_RISK_DICTIONARIES = "tb_risk_dictionaries";

    /**
     * 重点字典项详情
     */
    String TB_RISK_DICTIONARIES_ETAILS = "tb_risk_dictionaries_etails";

    /**
     * 风评名单管理
     */
    String TB_RISK_NAMELIST = "tb_risk_namelist";

    /**
     * 名单类型管理
     */
    String TB_RISK_NAMELIST_TYPE = "tb_risk_namelist_type";
    /**
     * 证件种类代码
     */
    String DCAP_F_COM_COD_CERT_TYPE="dcap_f_com_cod_cert_type";

    /**
     * 定义表索引表名称（存储所有表索引）
     */
    String INDEXNAMETABLE = "tablename";

    /**
     *出入境证件信息
     */
    String IMMCARD = "immcard";
    /**
     *
     */
    String DZDA = "dzda";
    /**
     *
     */
    String DCAP_TAB_FASTDFSS_BAK="dcap_tab_fastdfss_bak";
}
