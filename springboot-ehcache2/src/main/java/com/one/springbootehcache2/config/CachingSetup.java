package com.one.springbootehcache2.config;

import org.springframework.boot.autoconfigure.cache.JCacheManagerCustomizer;
import org.springframework.stereotype.Component;

import javax.cache.CacheManager;
import javax.cache.configuration.MutableConfiguration;
import javax.cache.expiry.Duration;
import javax.cache.expiry.TouchedExpiryPolicy;
import java.util.concurrent.TimeUnit;


/**
 * @author One
 */
@Component
public class CachingSetup implements JCacheManagerCustomizer {
    @Override
    public void customize(CacheManager cacheManager) {
        cacheManager.createCache("people", new MutableConfiguration<>()
                .setExpiryPolicyFactory(TouchedExpiryPolicy.factoryOf(new Duration(TimeUnit.SECONDS, 10)))
                .setStoreByValue(false)
                .setStatisticsEnabled(true));
    }
}