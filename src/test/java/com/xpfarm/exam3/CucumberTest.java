package com.xpfarm.exam3;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features")
@CucumberContextConfiguration
@ConfigurationPropertiesScan
public class CucumberTest {
}
