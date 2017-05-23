PDFReactor Notes
=============================
A in-house reference guide of the [PDFreactor Manual](http://www.pdfreactor.com/product/doc/manual.pdf)

- - -
Add Content from the guide here to collect ideas for implementation:

PDFReactor API
==============================
PDFReactor can be used through both an API and a Runnable Webservice Client. Both have their pros and cons.  

API
------------------------------

Webservice
------------------------------

API vs Webservice
------------------------------

Solution
------------------------------

CSS Directory
==============================
Page Counters
-----------------------------
To add page numbers to documents, Page Counters are used. Page Counters work like regular counters
(p. 73), but are defined on pages (p. 69) and accessed in page margin boxes (p. 74). The default Page Counter is named " page" and automatically defined in HTML documents

Example: A Page Counter used at the bottom right of the page to display the page number.

```html
@page{
 @bottom-right{
 content: counter(page)
 }
}
```

Multiple Columns
------------------------------
To create a multi-column layout inside an element add either the property column-count (p. 155) or
column-width (p. 159) or both. By adding them the element becomes a multi-column element.

The column-count property defines the number of columns inside the element. Any number greater than 1 will
create a multi-column layout. he column-width property is used to control how wide columns inside the element should be. The number of
columns is computed from that value. If both properties are used the resulting layout tries to ***honor both values***. column-count will provide the
maximum number of columns in most cases.

```html
/* define two columns */
div.twoColumns{ column-count: 2 }
/* define columns with a width of 2in */
div.twoInchColumns { column-width: 2in }
```

Note: This could be useful for fine tuning the column width. A previous issue with XSL.

The filling behavior can be controlled with the column-fill (p. 155) property. In this case, the columns are filled until no more
space is available in one column and the rest of the content needs to be moved to the next column:

```html
/* sequential filling behavior */
div.sequentialFill{ column-fill: auto }
/* balanced filling behavior */
div.balancedFill{ column-fill: balance }
```

There are elements that are required to span all columns inside the multi-column element instead of only one.
Headings, pictures or tables are the most common examples. To have an element span all columns the
column-span (p. 158) property is used.

```html
/* a heading that spans all columns */
h1{ column-span: all }
/* a table in a single column */
table{ column-span: none }
```

To visually separate columns it is possible to define the gap width. Gaps can be considered as padding between
columns. To define the gap width for a multi-column element the column-gap (p. 156) property is used.

```html
/* a gap of 0.25in */
div.multiColumn{ column-gap: 0.25in }
```

Another possible fine tuning tool for the column widths


Line Grids and Snapping
-------------------------------

With CSS it is possible to align lines of text to invisible grids in the document. This greatly improves readability
of duplex printing or for documents with multi-column layouts. Lines remain at the same position on every page,
thus keeping a vertical rhythm which is very beneficial to the reading experience.

Snapping to grid can be enabled by using the CSS property -ro-line-snap (p. 178). In addition to
snapping to the baseline of the grid, it is also possible snap line boxes to the center of two of the grid's lines.
The latter may be beneficial for text that contains small and large font sizes because the space in the grid is
used more efficiently.

```html
/* snapping to baseline */
p {
 -ro-line-snap: baseline;
}
```

Open Question: Where do these property values come from?
