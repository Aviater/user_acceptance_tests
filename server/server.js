const express = require('express');
const path = require('path');
const cors = require('cors');

const app = express();
app.use(cors());

app.get('/message', (req, res) => {
    res.contentType('application/xml');
    res.sendFile(path.join(__dirname , 'xml/system_message/system_message.xml'));
});

app.get('/order_stock', (req, res) => {
    res.contentType('application/xml');
    res.sendFile(path.join(__dirname , 'xml/system_order_stock/system_order_stock.xml'));
});

app.get('/query_stock', (req, res) => {
    res.contentType('application/xml');
    res.sendFile(path.join(__dirname , 'xml/system_query_stock/system_query_stock.xml'));
});

const port = 5000;
app.listen(port, () => console.log('Server started on port ' + port + '...'));