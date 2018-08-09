package ber.com.demo.demo.mybatis;

import ber.com.demo.demo.model.ViagemDto;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.util.List;

public abstract class MyBatisTemplate {



    public void executa() throws IOException {
        SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
        sqlSessionFactory.getConfiguration().addMapper(ViagemDto.class);
        SqlSession session = sqlSessionFactory.openSession();

        List<ViagemDto> viagem1 = session.selectList("buscaViagem");


        session.commit();
        session.close();
    }

}
