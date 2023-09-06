package config;

import org.aeonbits.owner.Config;
@Config.Sources({"classpath:conf.properties"})
public interface BaseConfig extends Config{

    String loginpage();
    String chromedriver();
}
