package com.testapp

import groovy.util.logging.Slf4j
import org.springframework.web.filter.GenericFilterBean

import javax.servlet.FilterChain
import javax.servlet.ServletException
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse

/**
 * If registered, this filter results in an HttpStatus of 500 being returned to the client
 */
@Slf4j
class MaintenanceModeFilter extends GenericFilterBean {

    void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        throw new NullPointerException()
    }
}