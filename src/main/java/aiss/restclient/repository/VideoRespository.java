package aiss.restclient.repository;

import aiss.restclient.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRespository extends JpaRepository<Video, Long> {
}