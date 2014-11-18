//
//  ScreenDim.m
//  ios-cordova
//
//  Created by Andrew Lunny on 12-07-11.
//  Copyright (c) 2012 __MyCompanyName__. All rights reserved.
//

#import "ScreenDim.h"

@implementation ScreenDim

- (void) enable:(CDVInvokedUrlCommand *)command
{	
    [[UIApplication sharedApplication] setIdleTimerDisabled:NO];
    NSLog(@" ScreenDim Plugin: dim enabled");
}


- (void) disable:(CDVInvokedUrlCommand *)command
{   
    [[UIApplication sharedApplication] setIdleTimerDisabled:YES];
    NSLog(@" ScreenDim Plugin: dim disabled");
}

@end
