## 出入境人员各指标向计算
## PersonComputeService

	注入personComputeService接口
	@Autowired
	private IPersonComputeService personComputeService;
	
	
	person各指标项计算，返回计算后各指标项的值
	personId 人员ID，passportno 证件号码，nationality 国籍，names 英文姓名，birthday 出生日期
	Person 返回类型
	调用方法：personComputeService.personCompute(personId,passportno,nationality,birthday);
	Map<String, String> personCompute(String personId, String passportno, String nationality, String names, String birthday) ;

	查询所有新疆人名拼写代码表
	调用方法：personComputeService.queryComCodSpellAllList();
	SearchResult queryComCodSpellAllList();

	
	获取旅客常客信息
	关联表有：TB_PNR_TRAVELER_TKT（旅客证件和票号信息）, tb_pnr_fti（旅客常客信息）
	nationality 国籍，cardnum 证件号码
	调用方法：personComputeService.queryPnrFtiInfo(nationality,cardnum);
	SearchResult queryPnrFtiInfo(String nationality, String cardnum);
	
	
	查询支付信息中的支付方式
	关联表有：TB_PNR_TRAVELER_TKT（旅客证件和票号信息），tb_pnr_tkt（机票信息），tb_pnr_fop（支付信息）
	nationality 国籍，cardnum 证件号码
	调用方法：personComputeService.queryPaymentType(nationality,cardnum);
	SearchResult queryPaymentType(String nationality, String cardnum);
	
