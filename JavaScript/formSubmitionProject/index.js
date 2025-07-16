let express=require("express");
let path=require("path");
let app=express();

let pubPath=path.join(__dirname,"public");
app.use(express.static(pubPath));
app.use(express.urlencoded({extended:true}));
app.get("/",(req,res)=>{
    res.sendFile(path.join(pubPath,"index.html"));
});
app.get("/save",(req,res)=>{
    let name=req.query.name;
    let email=req.query.email;
    res.send(name+" "+email+" ");
    res.end();
});
app.listen(2000,()=>{
    console.log("server is running on port 2000");
});