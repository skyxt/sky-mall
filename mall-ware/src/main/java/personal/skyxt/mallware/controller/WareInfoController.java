package personal.skyxt.mallware.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import personal.skyxt.mallware.entity.WareInfoEntity;
import personal.skyxt.mallware.service.WareInfoService;
import personal.skyxt.mallcommon.utils.PageUtils;
import personal.skyxt.mallcommon.utils.R;



/**
 * 仓库信息
 *
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-06 13:41:41
 */
@RestController
@RequestMapping("mallware/wareinfo")
public class WareInfoController {
    @Autowired
    private WareInfoService wareInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    ////@RequiresPermissions("mallware:wareinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wareInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    ////@RequiresPermissions("mallware:wareinfo:info")
    public R info(@PathVariable("id") Long id){
		WareInfoEntity wareInfo = wareInfoService.getById(id);

        return R.ok().put("wareInfo", wareInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    ////@RequiresPermissions("mallware:wareinfo:save")
    public R save(@RequestBody WareInfoEntity wareInfo){
		wareInfoService.save(wareInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    ////@RequiresPermissions("mallware:wareinfo:update")
    public R update(@RequestBody WareInfoEntity wareInfo){
		wareInfoService.updateById(wareInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    ////@RequiresPermissions("mallware:wareinfo:delete")
    public R delete(@RequestBody Long[] ids){
		wareInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
