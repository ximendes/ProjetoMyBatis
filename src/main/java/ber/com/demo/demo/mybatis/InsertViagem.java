package ber.com.demo.demo.mybatis;


import ber.com.demo.demo.model.Onibus;
import ber.com.demo.demo.model.Viagem;
import ber.com.demo.demo.model.ViagemDto;
import ber.com.demo.demo.repository.ViagemRepository;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;

@Component
public class InsertViagem {

    @Autowired
    private ViagemRepository viagemRepository;


    public void insertViagem() throws IOException {

        Viagem viagem = Viagem.builder().id(1L).name("Pantanal").build();
        List<Onibus> buses = this.buildOnibus();

        buses.forEach(b -> b.setViagem(viagem));

        viagem.setOnibus(buses);

        SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
        sqlSessionFactory.getConfiguration().addMapper(ViagemDto.class);
        SqlSession session = sqlSessionFactory.openSession();


        List<ViagemDto> viagem1 = session.selectList("buscaViagem");


        session.commit();
        session.close();


    }


    private List<Onibus> buildOnibus() {
        Onibus bus1 = Onibus.builder().id(1L).nome("onibus 1").build();
        Onibus bus2 = Onibus.builder().id(2L).nome("onibus 2").build();
        Onibus bus3 = Onibus.builder().id(3L).nome("onibus 3").build();
        return Arrays.asList(bus1, bus2, bus3);
    }
}
