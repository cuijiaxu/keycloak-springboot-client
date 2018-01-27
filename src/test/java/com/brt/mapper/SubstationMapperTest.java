package com.brt.mapper;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.brt.entity.Substation;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SubstationMapperTest {
	@Autowired
	private SubstationMapper substationMapper;
	@Test
	public void testInsert() throws Exception {
		Substation bs = new Substation();
		bs.setStationcode("123456");
		bs.setName("test");
		bs.setLongitude("12");
		bs.setLatitude("123456");
		bs.setCreatetime(new Date());
		substationMapper.insert(bs);
		
		//BusStation gs = substationMapper.getById(1);
		//System.out.println(gs.getStopname());
	}	
}
