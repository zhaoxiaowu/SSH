package com.ssh.service.impl;

import com.ssh.service.TestService;
import org.springframework.stereotype.Service;

/**
 * Cr/eated by simon
 * On 
 */
@Service
public class TestServiceImpl implements TestService {
    public String test() {
        return "test";
    }
}