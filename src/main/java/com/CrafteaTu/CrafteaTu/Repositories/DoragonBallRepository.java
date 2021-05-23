package com.CrafteaTu.CrafteaTu.Repositories;

import java.util.ArrayList;

import com.CrafteaTu.CrafteaTu.Model.DoragonBallModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoragonBallRepository extends CrudRepository<DoragonBallModel, Long> {

}
