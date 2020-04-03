package com.fitnesstracker.backend.app.service.repo;

import com.fitnesstracker.backend.app.domain.PastExercise;
import java.util.List;

public interface PastExerciseGateway {

  void save(PastExercise pastExercise);

  List<PastExercise> loadByUsername(String username);
}
