package com.nutri.app.service;

import java.util.List;

import com.nutri.app.entity.Annotation;

public interface IAnnotationService {
    void createAnnotation(Annotation annotation);

    void updateAnnotation(Long id, Annotation annotation);

    void deleteAnnotation(Long id);

    Annotation getAnnotation(Long id);

    List<Annotation> getAllAnnotations();
}
