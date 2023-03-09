package com.wjj.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wjj.reggie.dto.SetmealDto;
import com.wjj.reggie.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    //新增套餐，同时保存套餐和菜品的关联关系
    public void saveWithDish(SetmealDto setmealDto);
    //删除套餐同时删除关联的数据
    public void removeWithDish(List<Long> ids);
}
