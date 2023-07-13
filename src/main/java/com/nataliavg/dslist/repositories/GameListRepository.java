package com.nataliavg.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nataliavg.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}

