package cn.itcast.pinyougou.test.task;

import cn.itcast.pinyougou.mapper.TbSeckillGoodsMapper;
import cn.itcast.pinyougou.pojo.TbSeckillGoods;
import cn.itcast.pinyougou.pojo.TbSeckillGoodsExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/applicationContext-*.xml")
public class SeckillGoodsToRedisTest {

    @Autowired
    TbSeckillGoodsMapper tbSeckillGoodsMapper;

    @Test
    public void testTask() throws IOException {
        while(true){
            System.in.read();
        }
    }

    @Test
    public void testSel() {
        Method[] declaredMethods = tbSeckillGoodsMapper.getClass().getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }
        System.out.println(tbSeckillGoodsMapper.selectByPrimaryKey(1L));
        System.out.println(declaredMethods.length);
//        TbSeckillGoods tbSeckillGoods1 = tbSeckillGoodsMapper.selectByPrimaryKey(1L);
//        TbSeckillGoodsExample example = new TbSeckillGoodsExample();
//        TbSeckillGoodsExample.Criteria criteria = example.createCriteria();
//        Date date = new Date();
//        criteria.andStatusEqualTo("1")
//                .andStockCountGreaterThan(0)
//                .andStartTimeLessThanOrEqualTo(date)
//                .andEndTimeGreaterThan(date);
//        List<TbSeckillGoods> tbSeckillGoods = tbSeckillGoodsMapper.selectByExample(example);
//        System.out.println(tbSeckillGoods);
    }
}
