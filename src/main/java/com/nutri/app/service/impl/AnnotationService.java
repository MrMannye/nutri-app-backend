package com.nutri.app.service.impl;

import com.nutri.app.entity.Annotation;
import com.nutri.app.repository.AnnotationRepository;
import com.nutri.app.service.IAnnotationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnotationService implements IAnnotationService {

    @Autowired
    AnnotationRepository annotationRepository;

    @Override
    public void createAnnotation(Annotation annotation) {
        annotationRepository.save(annotation);
    }

    @Override
    public void updateAnnotation(Integer id, Annotation updatedAnnotation) {
        Annotation annotation = annotationRepository.findById(id).orElse(null);
        if (annotation != null) {
            annotation.setAnnSubject(updatedAnnotation.getAnnSubject());
            annotation.setAnnDate(updatedAnnotation.getAnnDate());
            annotation.setUser(updatedAnnotation.getUser());
            annotationRepository.save(annotation);
        }
    }

    @Override
    public void deleteAnnotation(Integer id) {
        annotationRepository.deleteById(id);
    }

    @Override
    public Annotation getAnnotation(Integer id) {
        return annotationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Annotation> getAllAnnotations() {
        return annotationRepository.findAll();
    }
}
