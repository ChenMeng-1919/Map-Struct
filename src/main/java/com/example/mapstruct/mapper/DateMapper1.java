package com.example.mapstruct.mapper;

import org.mapstruct.Named;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: cm
 * @since: Created in 2022/6/20 17:53
 * @description:
 */
@Named("dateMapper1")
public class DateMapper1 {

    public String toString(Date date) {
        return date != null ? new SimpleDateFormat("yyyy-MM-dd").format(date) : null;
    }

    public Date toDate(String date) {
        try {
            return date != null ? new SimpleDateFormat("yyyy-MM-dd").parse(date) : null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
