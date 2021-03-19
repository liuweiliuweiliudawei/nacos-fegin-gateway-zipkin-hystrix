//package com.example.springcloudgateway.config;
//
//import org.springframework.boot.actuate.autoconfigure.endpoint.condition.ConditionalOnAvailableEndpoint;
//import org.springframework.boot.actuate.health.Health;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.cloud.gateway.actuate.GatewayControllerEndpoint;
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.cloud.gateway.filter.factory.GatewayFilterFactory;
//import org.springframework.cloud.gateway.handler.predicate.RoutePredicateFactory;
//import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
//import org.springframework.cloud.gateway.route.RouteDefinitionWriter;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
///**
// * @Author: levy
// * @Date: 2021/3/17 10:39
// */
//@Configuration(proxyBeanMethods = false)
//@ConditionalOnClass(Health.class)
//public class GatewayAutoConfiguration {
//    @Bean
//    @ConditionalOnProperty(name = "spring.cloud.gateway.actuator.verbose.enabled", matchIfMissing = true)//默认为true
//    @ConditionalOnAvailableEndpoint
//    public GatewayControllerEndpoint gatewayControllerEndpoint(
//            List<GlobalFilter> globalFilters,
//            List<GatewayFilterFactory> gatewayFilters,
//            List<RoutePredicateFactory> routePredicates,
//            RouteDefinitionWriter routeDefinitionWriter,
//            RouteLocator routeLocator,
//            RouteDefinitionLocator routeDefinitionLocator) {
//        return new GatewayControllerEndpoint(globalFilters, gatewayFilters,routePredicates, routeDefinitionWriter, routeLocator,routeDefinitionLocator);
//    }
//
//}
