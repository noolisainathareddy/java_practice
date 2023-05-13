package com.irving.library.serviceimpl;

import com.irving.library.service.GangaBookService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("gangaBookStore")
public class GangaBookServiceImpl implements GangaBookService {

    @Override
    public String gangaHealthCheck() {
        return "HealthCheckIsGood from GangaBooks";
    }
}
