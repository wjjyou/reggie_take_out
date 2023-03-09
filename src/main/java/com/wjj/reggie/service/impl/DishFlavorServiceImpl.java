package com.wjj.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjj.reggie.entity.DishFlavor;
import com.wjj.reggie.mapper.DishFlavorMapper;
import com.wjj.reggie.service.DishFlavorService;
import com.wjj.reggie.service.DishService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper,DishFlavor>
        implements DishFlavorService {
}