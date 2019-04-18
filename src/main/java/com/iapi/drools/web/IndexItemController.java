package com.iapi.drools.web;

/**
 * @ClassName IndexItemController
 * @Description 修改新增指标项
 * @Author ChengGuojun
 * @Date 2019-01-18 16:11
 * @Version 1.0
 */
import com.google.gson.Gson;
import com.iapi.drools.bean.indexitem.IndexItem;
import com.iapi.drools.bean.indexitem.RequestIndexItem;
import com.iapi.drools.bean.indexitem.Script;
import com.iapi.drools.common.exception.JsonResponse;
import com.iapi.drools.service.IndexItemService;
import com.iapi.drools.service.ItemSynchroService;
import io.swagger.annotations.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/indexItem", method = RequestMethod.POST)
public class IndexItemController {
    private Logger logger = LogManager.getLogger(IndexItemController.class);

    @Autowired
    private IndexItemService indexItemService;
    @Autowired
    private ItemSynchroService itemSynchroService;
    @ApiOperation(value = "添加指标项脚本")
    @ApiImplicitParam(
            name = "script", dataType = "String", required = true, value = "{\"indexItems\":[{ \"version\":\"1.0\",\"content\":\"xxx\",\"item\":\"SJD\" 大写字母}]",
            defaultValue = "{\"indexItems\":[{ \"version\":\"1.0\",\"content\":\"xxx\",\"item\":\"SJD\" 大写字母}]"
    )
    @RequestMapping(value = "/addIndexItem", method = RequestMethod.POST)
    public JsonResponse addIndexItem(@RequestBody String script) {
        logger.info("api: addIndexItem --- ");
        Gson gson = new Gson();
        RequestIndexItem indexItems = gson.fromJson(script, RequestIndexItem.class);
        String msg = itemSynchroService.add(indexItems);
        return new JsonResponse(msg);
    }


    @ApiOperation(value = "根据指标项名称更新指标项脚本")
    @ApiImplicitParam(
            name = "script", dataType = "String", required = true, value = " { \"version\":\"1.0\",\"updateTime\": null,\"content\":\"xxx\",\"item\":\"SJD\" 大写字母}",
            defaultValue = "{ \"version\":\"1.0\",\"content\":\"xxx\",\"item\":\"SJD\" 大写字母}"
    )
    @RequestMapping(value = "/updateIndexItem", method = RequestMethod.POST)
    public JsonResponse updateIndexItem(@RequestBody String script) {
        logger.info("api: updateIndexItem --- ");
        Gson gson = new Gson();
        IndexItem indexItem = gson.fromJson(script, IndexItem.class);
        String msg = itemSynchroService.update(indexItem);
        return new JsonResponse(msg);
    }

    @ApiOperation(value = "根据指标项名称删除指标项脚本")
    @ApiImplicitParam(
            name = "script", dataType = "String", required = true, value = " {\"script\":\"SJD\" } 大写字母",
            defaultValue = "{\"script\":\"SJD\" } 大写字母"
    )
    @RequestMapping(value = "/deleteIndexItem", method = RequestMethod.POST)
    public JsonResponse deleteIndexItem(@RequestBody String script) {
        logger.info("api:  deleteIndexItem --- ");
        Gson gson = new Gson();
        Script script1 = gson.fromJson(script, Script.class);
        String msg = itemSynchroService.delete(script1.getScript());
        return new JsonResponse(msg);
    }

    @ApiOperation(value = "根据指标项名称查询指标项脚本")
    @ApiImplicitParam(
            name = "script", dataType = "String", required = true, value = "{\"script\":\"SJD\" }大写字母",
            defaultValue = "{\"script\":\"SJD\" } 大写字母"
    )
    @RequestMapping(value = "/findIndexItem", method = RequestMethod.POST)
    public JsonResponse findIndexItem(@RequestBody String script) {
        logger.info("api:  findIndexItem --- ");
        Gson gson = new Gson();
        Script script1 = gson.fromJson(script, Script.class);
        return new JsonResponse(indexItemService.findIndexItem(script1.getScript()));
    }


    @ApiOperation(value = "清空脚本")
    @RequestMapping(value = "/clearScript", method = RequestMethod.POST)
    public JsonResponse clearScript() {
        logger.info("api:  deleteIndexItem --- ");
        return new JsonResponse(itemSynchroService.clear());
    }

    @ApiOperation(value = "查询全部")
    @RequestMapping(value = "/findAllScript", method = RequestMethod.POST)
    public JsonResponse findAllScript() {
        logger.info("api:  findAllScript --- ");
        return new JsonResponse(indexItemService.findAllScript());
    }

    @ApiOperation(value = "脚本测试")
    @RequestMapping(value = "/execTestScript", method = RequestMethod.POST)
    public JsonResponse execTestScript() {
        logger.info("api:  findAllScript --- ");
        return new JsonResponse(indexItemService.execTestScript());
    }

    @ApiOperation(value = "脚本语法验证")
    @RequestMapping(value = "/validateScript", method = RequestMethod.POST)
    public JsonResponse validateScript(@RequestBody String script) {
        logger.info("api: validateScript --- ");
        Gson gson = new Gson();
        RequestIndexItem indexItems = gson.fromJson(script, RequestIndexItem.class);
        String msg = indexItemService.validateScript(indexItems);
        return new JsonResponse(msg);
    }

}
