package com.example.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {


    @RequestMapping("/new_student")
    public String newStudent(Model model) {
        model.addAttribute("grades", Grade.values()/* call the method on the Grade enum to get all the grades */);
        return "new_student";
    }

    @RequestMapping("/create_student")
    public String createStudent(@RequestParam(value="firstName") String firstName, @RequestParam(value="lastName") String lastName , @RequestParam (value="grade") Grade grade, Model model){
        Student student = new Student();

        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setGrade(grade);

        /* set student firstName, lastName and grade using the http request parameters */

        /* add the student to the model that will be used by the view_student html file */
        model.addAttribute(student);


        return "view_student";
    }
}
