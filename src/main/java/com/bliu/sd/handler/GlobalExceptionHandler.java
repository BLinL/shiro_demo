package com.bliu.sd.handler;

import com.bliu.sd.common.OpenResultDTO;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({BindException.class})
    public ModelAndView paramInvalidExceptionHandler(BindException e){
        BindingResult result = e.getBindingResult();
        StringBuilder err = new StringBuilder();
        if(result.hasErrors()){
            List<ObjectError> errors = result.getAllErrors();
            errors.forEach(p->{
                err.append(p.getDefaultMessage() + " ");
            });
        }
        OpenResultDTO openResultDTO = OpenResultDTO.fail(err.toString());
        ModelAndView mv = new ModelAndView("errMsg");
        mv.addObject("err",openResultDTO);
        return mv;
    }
}
