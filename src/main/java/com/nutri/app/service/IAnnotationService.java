package com.nutri.app.service;

import java.util.List;

import com.nutri.app.entity.Annotation;

public interface IAnnotationService {
    void createAnnotation(Annotation annotation);

    void updateAnnotation(Integer id, Annotation annotation);

    void deleteAnnotation(Integer id);

    Annotation getAnnotation(Integer id);

    List<Annotation> getAllAnnotations();
}
