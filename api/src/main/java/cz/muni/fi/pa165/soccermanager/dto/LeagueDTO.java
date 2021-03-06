package cz.muni.fi.pa165.soccermanager.dto;

import cz.muni.fi.pa165.soccermanager.entity.Match;
import cz.muni.fi.pa165.soccermanager.enums.NationalityEnum;

import java.util.List;
import java.util.Set;

/**
 * @author 476368 Iman Mehmandoust
 * @version 11/27/2017.
 */

public class LeagueDTO {

    private Long id;
    private NationalityEnum country;
    private String name;

    private List<Match> matches;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NationalityEnum getCountry() {
        return country;
    }

    public void setCountry(NationalityEnum country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LeagueDTO)) return false;

        LeagueDTO leagueDTO = (LeagueDTO) o;

        if (country != leagueDTO.country) return false;
        return name == leagueDTO.name;
    }

    @Override
    public int hashCode() {
        int result = country.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "LeagueDTO{" +
                "country=" + country +
                ", name='" + name + '\'' +
                '}';
    }
}
