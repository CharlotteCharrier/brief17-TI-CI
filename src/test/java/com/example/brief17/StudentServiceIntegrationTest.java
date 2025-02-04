package com.example.brief17;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

import com.example.brief17.entity.Student;
import com.example.brief17.service.StudentService;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

// TODO: Ajouter les tags nécessaires pour charger H2, charger le profil de test et importer le StudentService
@SpringBootTest
@ActiveProfiles("test")
class StudentServiceIntegrationTest {

    @Autowired
    private StudentService studentService;

    @Test
    void shouldSaveAndRetrieveStudent() {

        Student student = Student.builder().name("Robert").address("test").build();

        Student savedStudent = studentService.saveStudent(student);

        Optional<Student> dbStudent = studentService.findStudentById(savedStudent.getId());

        assertThat(dbStudent.isPresent()).isTrue();
        assertThat(dbStudent.get()).isEqualTo(savedStudent);
        // TODO: Implémenter le test d'intégration, insérer un Student en base de données et le récupérer
    }
}