package com.wjj.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wjj.reggie.dto.DishDto;
import com.wjj.reggie.entity.Dish;

public interface DishService extends IService<Dish> {

    //新增菜品，同时插入菜品对应的口味数据，需要操作两张表:dish , dish_flavor
    public void saveWithFlavor(DishDto dishDto);
    //根据id查讯菜品信息和对应的口味信息
    public DishDto getByIdWithFlavor(Long id);
    //跟新菜品信息同时更新口味信息
    public void updateWithFlavor(DishDto dishDto);
}
