## ElasticSearch 接口操作，下面对各接口详细说明
## IElasticSearchService

	注入ElasticSearch接口
	@Autowired
	private IElasticSearchService esService;
	
	删除索引
	调用方法：esService.deleteIndex("index");
	index：ES索引，不可以为空
	public JestResult deleteIndex(String index);
	
	
	清除缓存
	调用方法：esService.clearCache();
	public JestResult clearCache();
	
	关闭索引
	调用方法：esService.closeIndex("index");
	index：ES索引，不可以为空
	public JestResult closeIndex(String index);
	
	优化索引
	调用方法：esService.optimizeIndex();
	public JestResult optimizeIndex();
	
	判断索引是否存在
	调用方法：esService.indicesExists(index);
	index：ES索引，不可以为空
	public JestResult indicesExists(String index);
	
	查看节点信息
	调用方法：esService.nodesInfo();
	public JestResult nodesInfo();
	
	查看集群健康信息
	调用方法：esService.health();
	public JestResult health();
	
	查看节点状态信息
	调用方法：esService.nodesStats();
	public JestResult nodesStats();
	
	更新Document
	script 更新内容，index 文档存放位置，type 文档表示的对象类别，id 文档唯一标识
	调用方法：esService.updateDocument(script,index,type,id);
	public JestResult updateDocument(String script, String index, String type, String id);
	
	删除Document
	index 文档存放位置，type 文档表示的对象类别，id 文档唯一标识
	调用方法：esService.deleteDocument(index,type,id);
	public JestResult deleteDocument(String index, String type, String id);
	
	
	根据条件删除
	index 文档存放位置，type 文档表示的对象类别，param 文档删除条件
	调用方法：esService.deleteDocumentByQuery(index,type,param);
	public JestResult deleteDocumentByQuery(String index, String type, String param);
	
	
	获取Document
	o 返回对象，index 文档存放位置，type 文档表示的对象类别，id 文档唯一标识
	调用方法：esService.getDocumnet(o,index,type,id);
	public <T> JestResult getDocumnet(T o, String index, String type, String id);
	
	根据类型 typeName获取 Document
	indexName 索引名称，indexs 文档对象类别
	调用方法：esService.getDocumnetByIndex(indexName,indexs);
	public <T> JestResult getDocumnetByIndex(String indexName, String indexs);
	
	根据内容属性查询
	attribute 属性名，context 属性内容
	调用方法：esService.getDocumentByContextAttribute(attribute,context);
	public <T> JestResult getDocumentByContextAttribute(String attribute, String context);
	
	
	创建索引
	index 创建的索引名称，type 文档表示的对象类别
	调用方法：esService.createIndex(index,type);
	public JestResult createIndex(String index, String type);
	
	搜索事件流图表数据
	param 图表数据参数
	调用方法：esService.searchEvent(param);
	public JsonObject searchEvent(String param);

	根据JSON，获取信息
	json 查询串；
	例：{query:"username",operator:"or",fields:"field1"}
	调用方法：esService.multiMatchQuery(json);
	public SearchResult multiMatchQuery(String json);

	普通JSON 串查询
	json 查询串，operator 各查询条件间的关系 AND 或 OR
	例：{field:"username",field2:"mail"}
	调用方法：esService.queryByTarget(json,operator);
	public SearchResult queryByTarget(String json, String operator);
	
	获取人员ID
	fields 条件字段
	例：{"nationality": "CHN", "passportno": "N123456789","birthday":"1970-01-01","name":"李四"}
	调用方法：esService.queryPersonId(json,operator);
	public SearchResult queryPersonId(String fields);
	
	获取集群各节点状态
	调用方法：esService.getElasticsearchStatus();
	public Map<String, Object> getElasticsearchStatus() throws Exception;

