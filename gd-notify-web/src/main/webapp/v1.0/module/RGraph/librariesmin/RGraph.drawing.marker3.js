
RGraph=window.RGraph||{isRGraph:true};RGraph.Drawing=RGraph.Drawing||{};RGraph.Drawing.Marker3=function(conf)
{if(typeof conf==='object'&&typeof conf.x==='number'&&typeof conf.y==='number'&&typeof conf.id==='string'&&typeof conf.radius==='number'){var id=conf.id
var canvas=document.getElementById(id);var x=conf.x;var y=conf.y;var radius=conf.radius;var parseConfObjectForOptions=true;}else{var id=conf;var canvas=document.getElementById(id);var x=arguments[1];var y=arguments[2];var radius=arguments[3];}
this.id=id;this.canvas=document.getElementById(this.id);this.context=this.canvas.getContext('2d')
this.colorsParsed=false;this.canvas.__object__=this;this.original_colors=[];this.firstDraw=true;this.actualRadius=0;this.alpha=1;this.centerx=x;this.centery=y;this.radius=radius;this.type='drawing.marker3';this.isRGraph=true;this.uid=RGraph.CreateUID();this.canvas.uid=this.canvas.uid?this.canvas.uid:RGraph.CreateUID();this.properties={'chart.fillstyle':'rgba(255,255,255,1)','chart.delay':50,'chart.events.click':null,'chart.events.mousemove':null,'chart.highlight.fill':'rgba(255,0,0,1.0)','chart.tooltips':null,'chart.tooltips.highlight':true,'chart.tooltips.event':'onclick'}
if(!this.canvas){alert('[DRAWING.MARKER3] No canvas support');return;}
this.coords=[];this.coordsText=[];this.$0={};if(!this.canvas.__rgraph_aa_translated__){this.context.translate(0.5,0.5);this.canvas.__rgraph_aa_translated__=true;}
var RG=RGraph,ca=this.canvas,co=ca.getContext('2d'),prop=this.properties,pa=RG.Path,pa2=RG.path2,win=window,doc=document,ma=Math
if(RG.Effects&&typeof RG.Effects.decorate==='function'){RG.Effects.decorate(this);}
this.set=this.Set=function(name)
{var value=typeof arguments[1]==='undefined'?null:arguments[1];if(arguments.length===1&&typeof name==='object'){RG.parseObjectStyleConfig(this,name);return this;}
if(name.substr(0,6)!='chart.'){name='chart.'+name;}
name=name.replace(/([A-Z])/g,function(str)
{return'.'+String(RegExp.$1).toLowerCase();});prop[name]=value;return this;};this.get=this.Get=function(name)
{if(name.substr(0,6)!='chart.'){name='chart.'+name;}
name=name.replace(/([A-Z])/g,function(str)
{return'.'+String(RegExp.$1).toLowerCase()});return prop[name.toLowerCase()];};this.draw=this.Draw=function()
{co.globalAlpha=this.alpha;pa(this,['b','a',this.centerx,this.centery,this.actualRadius,0,2*Math.PI,false,'a',this.centerx,this.centery,ma.max(this.actualRadius-8,0),2*Math.PI,0,true,'f',prop['chart.fillstyle']]);this.alpha=this.actualRadius?1-((this.actualRadius*0.75)/this.radius):1;co.globalAlpha=1;if(this.actualRadius<this.radius){this.actualRadius+=2;}else if(this.actualRadius>=this.radius){this.actualRadius=0;this.alpha=1;}
var obj=this;setTimeout(function()
{RG.redrawCanvas(ca);},prop['chart.delay']);RG.InstallEventListeners(this);if(this.firstDraw){RG.fireCustomEvent(this,'onfirstdraw');this.firstDraw=false;this.firstDrawFunc();}
RG.fireCustomEvent(this,'ondraw');return this;};this.exec=function(func)
{func(this);return this;};this.getObjectByXY=function(e)
{if(this.getShape(e)){return this;}};this.getShape=function(e)
{var mouseXY=RGraph.getMouseXY(e);var mouseX=mouseXY[0];var mouseY=mouseXY[1];if(RG.getHypLength(this.centerx,this.centery,mouseXY[0],mouseXY[1])<=this.radius){return{0:this,1:this.centerx,2:this.centery,3:this.radius,4:null,5:0,'object':this,'x':this.centerx,'y':this.centery,'radius':this.radius,'index':0,'tooltip':prop['chart.tooltips']?prop['chart.tooltips'][0]:null};}
return null;};this.positionTooltip=function(obj,x,y,tooltip,idx)
{var canvasXY=RG.getCanvasXY(obj.canvas);var width=tooltip.offsetWidth;var height=tooltip.offsetHeight;var radius=this.radius;tooltip.style.left=0;tooltip.style.top=canvasXY[1]+obj.centery-height-7+'px';tooltip.style.overflow='';var img=new Image();img.src='data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAAFCAYAAACjKgd3AAAARUlEQVQYV2NkQAN79+797+RkhC4M5+/bd47B2dmZEVkBCgcmgcsgbAaA9GA1BCSBbhAuA/AagmwQPgMIGgIzCD0M0AMMAEFVIAa6UQgcAAAAAElFTkSuQmCC';img.style.position='absolute';img.id='__rgraph_tooltip_pointer__';img.style.top=(tooltip.offsetHeight-2)+'px';tooltip.appendChild(img);if((canvasXY[0]+obj.centerx-(width/2))<10){tooltip.style.left=(canvasXY[0]+this.centerx-(width*0.1))+'px';img.style.left=((width*0.1)-8.5)+'px';}else if((canvasXY[0]+obj.centerx+(width/2))>doc.body.offsetWidth){tooltip.style.left=canvasXY[0]+this.centerx-(width*0.9)+'px';img.style.left=((width*0.9)-8.5)+'px';}else{tooltip.style.left=(canvasXY[0]+this.centerx-(width*0.5))+'px';img.style.left=((width*0.5)-8.5)+'px';}};this.highlight=this.Highlight=function(shape)
{if(prop['chart.tooltips.highlight']){pa(this,['b','r',this.coords[0][0],this.coords[0][1],this.coords[0][2],this.coords[0][3],'f',prop['chart.highlight.fill'],'s',prop['chart.highlight.stroke']]);}};this.parseColors=function()
{if(this.original_colors.length===0){this.original_colors['chart.fillstyle']=RG.array_clone(prop['chart.fillstyle']);this.original_colors['chart.highlight.fill']=RG.array_clone(prop['chart.highlight.fill']);}
prop['chart.fillstyle']=this.parseSingleColorForGradient(prop['chart.fillstyle']);prop['chart.highlight.fill']=this.parseSingleColorForGradient(prop['chart.highlight.fill']);};this.reset=function()
{};this.parseSingleColorForGradient=function(color)
{var canvas=this.canvas;var context=this.context;if(!color){return color;}
if(typeof color==='string'&&color.match(/^gradient\((.*)\)$/i)){var parts=RegExp.$1.split(':');var grad=co.createRadialGradient(this.centerx,this.centery,0,this.centerx,this.centery,this.radius);var diff=1/(parts.length-1);for(var j=0;j<parts.length;j+=1){grad.addColorStop(j*diff,RG.trim(parts[j]));}}
return grad?grad:color;};this.on=function(type,func)
{if(type.substr(0,2)!=='on'){type='on'+type;}
this[type]=func;return this;};this.firstDrawFunc=function()
{};RG.att(ca);RG.Register(this);if(parseConfObjectForOptions){RG.parseObjectStyleConfig(this,conf.options);}};
