package com.mrsantos.holybibleacf.app.models;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class ChaptersModel {
    private int id;
    private BooksModel book;
    private List<VersesModel> verse;
}


