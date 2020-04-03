package com.fitnesstracker.backend.app.service.impl;

import com.fitnesstracker.backend.app.domain.PastExercise;
import com.fitnesstracker.backend.app.service.SavePastExercises;
import com.fitnesstracker.backend.app.service.repo.PastExerciseGateway;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class SavePastExercisesUsecase implements SavePastExercises {

  private final PastExerciseGateway gateway;

  public SavePastExercisesUsecase(PastExerciseGateway gateway) {
    this.gateway = gateway;
  }

  @Transactional
  @Override
  public void save(PastExercise exercise, String username) {
    exercise.setUsername(username);
    gateway.save(exercise);
  }
}
