package com.starwars.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = Film.class, name = "titleAndOpening")
public interface FilmTitleWithOpening {
    String getTitle();
    String getOpeningCrawl();
}
